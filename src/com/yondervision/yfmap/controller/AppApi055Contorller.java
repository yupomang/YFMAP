package com.yondervision.yfmap.controller;

import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.common.mess.SimpleHttpMessageUtil;
import com.yondervision.yfmap.common.security.EncryptionByMD5;
import com.yondervision.yfmap.form.AppApi50001Form;
import com.yondervision.yfmap.form.AppApi50007Form;
import com.yondervision.yfmap.util.PropertiesReader;
import com.yondervision.yfmap.util.ShiJiPublicDatasTokenUtil;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;

/**
 * @author 张杰
 * @version V1.0
 * @date 2021/01/05 15:26
 */
@Controller
public class AppApi055Contorller {
    Logger log = Logger.getLogger("YFMAP");

    @RequestMapping("/appapi00179.{ext}")
    public void appapi00179(AppApi50007Form form, ModelMap modelMap, HttpServletRequest request,
                            HttpServletResponse response)throws Exception {
        form.setBusinName("非因工伤残或因病丧失劳动能力程度鉴定结论");
        log.info("api/appapi00179 begin.++++++++++++zhangj");
        log.info(Constants.LOG_HEAD + "api/appapi00179 begin.");
        //连接浙江省公共数据平台获取数据
        String requestSecret = ShiJiPublicDatasTokenUtil.getPublicDataSecretWithCouchBase(form.getCenterId());
        log.info(requestSecret);
        Date date = new Date();
        String requestTime = String.valueOf(date.getTime());
        log.info("requestTime33333:" + requestTime);
        String appKey = PropertiesReader.getProperty(Constants.PROPERTIES_FILE_NAME, "sjappKey").trim().toLowerCase();
        String publicDatasUrl = PropertiesReader.getProperty(Constants.PROPERTIES_FILE_NAME, "sjpublicDatasUrl").trim();
        String sign = EncryptionByMD5.getMD5((appKey + requestSecret.toLowerCase() + requestTime).getBytes("UTF-8")).toLowerCase();

        HashMap<String, String> params = new HashMap<String, String>();
        //String url = publicDatasUrl + "api/001003085/dataSharing/socialPersonalParticipationInfo.htm";
        String url = publicDatasUrl + "api/001008002016003/dataSharing/ewce3def58YKbc2a.htm";
        log.info("连接外部url:" + url);

        params.put("appKey", appKey);
        params.put("sign", sign);
        params.put("requestTime", requestTime);
        params.put("zjhm", form.getZjhm());
        params.put("bjdr", form.getBjdr());

        SimpleHttpMessageUtil simpleHttpMessageUtil = new SimpleHttpMessageUtil();
        log.info("api/appapi00179 running.++++++++++++zhangj");
        String result = simpleHttpMessageUtil.sendPost(url, params, "utf-8");

        log.info("非因工伤残或因病丧失劳动能力程度鉴定结论:" + result);
        //JSONObject json = JSONObject.fromObject(result);
        JSONObject json = JSONObject.fromObject(result.replace("\\\"", ""));
        if (json.get("code").equals("00")) {
            json.put("recode", "000000");
        }
        json.remove("code");
        log.info(Constants.LOG_HEAD + "appapi00179 end.");
        log.info("form.getChannel()=" + form.getChannel());

        if (form.getChannel().trim().equals("")) {
            log.info("gbk");
            log.info("json.toString()==========" + json.toString());
            response.getOutputStream().write(json.toString().getBytes(request.getCharacterEncoding()));
        } else {
            log.info("utf-8");
            response.getOutputStream().write(json.toString().getBytes("utf-8"));
        }
        return;


    }

}
