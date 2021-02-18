package com.yondervision.yfmap.controller;

import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.common.mess.SimpleHttpMessageUtil;
import com.yondervision.yfmap.form.AppApi00178Form;
import com.yondervision.yfmap.form.AppApi00225Form;
import com.yondervision.yfmap.util.PropertiesReader;
import com.yondervision.yfmap.util.RSAUtil;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

import static com.yondervision.yfmap.common.Constants.PROPERTIES_FILE_NAME;

/**
 * @author 张杰
 * @version V1.0
 * @date 2020/12/31 15:26
 */
@Controller
public class AppApi053Contorller {

    Logger log = Logger.getLogger("YFMAP");

    @RequestMapping("/appapi00178.{ext}")
    public void appapi00178(AppApi00178Form form, HttpServletRequest request, HttpServletResponse response) throws Exception{
        form.setBusinName("浙江省省自然资源厅建设规划许可证");
        log.info(Constants.LOG_HEAD+"api/appapi00178 begin.");

        long starTime=System.currentTimeMillis();
        HashMap<String, String> params = new HashMap<String, String>();
        String url = "http://172.16.10.91:9315/gjjfw/sjgxService/doQuery.do";
        //String url = "http://59.202.30.116:9315/gjjfw/sjgxService/doQuery.do";

       // String tyxydm = form.getTyxydm();
        //String regno = form.getRegno();
        String jgh = form.getBrccode();
        String jkbm = "jsghxkz";
        String para = "{\"tyxydm\":\""+form.getTyxydm()+"\",\"regno\":\""+form.getRegno()+"\",\"idcard\":\""+form.getIdcard()+"\"}";


        /** 指定公钥存放文件 */
        String PUBLIC_KEY= PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "public_key_shengting").trim();

        /** 指定私钥存放文件 */
        String PRIVATE_KEY=PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "private_key_shengting").trim();

        params.put("jgh", jgh);
        params.put("jkbm", jkbm);
        params.put("para", RSAUtil.encrypt(para,PUBLIC_KEY));

        log.info("para==="+para);
        log.info("RSAUtil.encrypt(para,PUBLIC_KEY)==="+RSAUtil.encrypt(para,PUBLIC_KEY));
        SimpleHttpMessageUtil simpleHttpMessageUtil= new SimpleHttpMessageUtil();
        String result = simpleHttpMessageUtil.sendPost(url, params,"utf-8");

        log.info("省厅返回result="+result);
        result =  RSAUtil.decrypt(result,PRIVATE_KEY).replace("code", "recode");
        log.info("解密后result="+result);
        long endTime=System.currentTimeMillis();

        long Time=endTime-starTime;
        System.out.println("请求耗时"+Time+"毫秒");
        JSONObject json = JSONObject.fromObject(result);

        log.info(Constants.LOG_HEAD+"appapi00178 end.");
        log.info("form.getChannel()="+form.getChannel());
        response.getOutputStream().write(json.toString().getBytes(request.getCharacterEncoding()));
        return ;
    }
}
