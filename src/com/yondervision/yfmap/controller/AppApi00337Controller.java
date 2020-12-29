package com.yondervision.yfmap.controller;

import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.common.mess.YbmapMessageUtil;
import com.yondervision.yfmap.form.AppApi00225Form;
import com.yondervision.yfmap.form.AppApi00226Form;
import com.yondervision.yfmap.form.AppApi030Form;
import com.yondervision.yfmap.util.BeanUtil;
import com.yondervision.yfmap.util.PropertiesReader;
import net.sf.json.JSONObject;
//import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import static com.yondervision.yfmap.common.Constants.PROPERTIES_FILE_NAME;

@Controller
public class AppApi00337Controller {

    Logger log = Logger.getLogger("YFMAP");


    @RequestMapping("/appapi00337.{ext}")
    public void appapi00337(AppApi00226Form form, ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        form.setBusinName("异地贷款缴存使用证明打印");
        log.info(Constants.LOG_HEAD+"api/appapi00337 begin.");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        form.setTransdate(dateFormat.format(new Date()));
        form.setQdapprnum("YTJ" + UUID.randomUUID());
        form.setSeqno("1");
        log.info("YF---appapi00337------  ");
        log.info("appapi00337--form.getAccnum()======" + form.getAccnum());
        log.info("appapi00337--form.getCertinum()======" + form.getCertinum());
        log.info("appapi00337--form.getCentername()======" + form.getCentername());
        log.info("appapi00337--form.getUserid()======" + form.getUserid());
        log.info("appapi00337--form.getBrccode()======" + form.getBrccode());
        log.info("appapi00337--form.getChannel()======" + form.getChannel());
        log.info("appapi00337--form.getProjectname()======" + form.getProjectname());
        log.info("appapi00337--form.getTransdate======" + form.getTransdate());
        log.info("appapi00337--form.getQdapprnum======" + form.getQdapprnum());
        log.info("appapi00337--form.getSeqno======" + form.getSeqno());

		AppApi030Form form1 = new AppApi030Form();
		String accnum = form.getAccnum();
		form1.setAccnum(accnum);
		System.out.println("appapi00337--accnum: " +  form1.getAccnum() +
				"--- " + StringUtils.equalsIgnoreCase("0238557595", accnum));

		String certinum = form.getCertinum();
		form1.setCertinum(certinum);
		System.out.println("appapi00337--certinum: " +  form1.getCertinum() +
				"--- " + StringUtils.equalsIgnoreCase("330283198802270016", certinum));

		String userId = form.getUserid();
		form1.setUserId(userId);
		System.out.println("appapi00337--userId: " +  form1.getUserId() +
				"--- " + StringUtils.equalsIgnoreCase("stgy", userId));


		String brcCode = form.getBrccode();
		form1.setBrcCode(brcCode);
		System.out.println("appapi00337--brcCode: " +  form1.getBrcCode() +
				"--- " + StringUtils.equalsIgnoreCase("05740008", brcCode));


		String seqno = form.getSeqno();
		form1.setSeqno(seqno);
		System.out.println("appapi00337--seqno: " +  form1.getSeqno() +
				"--- " + StringUtils.equalsIgnoreCase("1", seqno));

		String projectName = form.getProjectname();
		form1.setProjectname(projectName);
		System.out.println("appapi00337--projectName: " +  form1.getProjectname() +
				"--- " + StringUtils.equalsIgnoreCase("宁波公积金中心", projectName));

		String channel = form.getChannel();
		form1.setChannel(channel);
		System.out.println("appapi00337--channel: " +  form1.getChannel() +
				"--- " + StringUtils.equalsIgnoreCase("10", channel));

		String buzType = form.getBuzType();
		form1.setBuzType(buzType);
		System.out.println("appapi00337--buzType: " +  form1.getBuzType() +
				"--- " + StringUtils.equalsIgnoreCase("10", buzType));

		String centerId = form.getCenterId();
		form1.setCenterId(centerId);
		System.out.println("appapi00337--centerId: " +  form1.getCenterId() +
				"--- " + StringUtils.equalsIgnoreCase("10", centerId));


		form1.setTransdate(dateFormat.format(new Date()));

		form1.setQdapprnum("YTJ" + UUID.randomUUID());

		HashMap map = BeanUtil.transBean2Map(form1);
		YbmapMessageUtil post = new YbmapMessageUtil();
		String url = PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "YBMAPURL").trim() + "appapi03824.json";
		System.out.println("YBMAP url ：" + url);
		String rm = post.post(url, map);
		System.out.println("AppApi00337:开始异地贷款缴存使用证明打印接口：" + rm);

		System.out.println("rm ：" + rm);
		JSONObject json = JSONObject.fromObject(rm);
		log.info(Constants.LOG_HEAD + "appapi00337 end.");
		log.info("gbk");
		log.info("json.toString()==========" + json.toString());

        AppApi00226Form form2 = new AppApi00226Form();

/*

		form2.setAccnum(accnum);
		System.out.println("appapi00337--accnum: " +  form2.getAccnum() +
				"--- " + StringUtils.equalsIgnoreCase("0238557595", accnum));


		form2.setCertinum(certinum);
		System.out.println("appapi00337--certinum: " +  form2.getCertinum() +
				"--- " + StringUtils.equalsIgnoreCase("330283198802270016", certinum));


		form2.setUserId(userId);
		System.out.println("appapi00337--userId: " +  form2.getUserId() +
				"--- " + StringUtils.equalsIgnoreCase("stgy", userId));



		form2.setBrcCode(brcCode);
		System.out.println("appapi00337--brcCode: " +  form2.getBrcCode() +
				"--- " + StringUtils.equalsIgnoreCase("05740008", brcCode));



		form2.setSeqno(seqno);
		System.out.println("appapi00337--seqno: " +  form2.getSeqno() +
				"--- " + StringUtils.equalsIgnoreCase("1", seqno));

		form2.setProjectname(projectName);
		System.out.println("appapi00337--projectName: " +  form2.getProjectname() +
				"--- " + StringUtils.equalsIgnoreCase("宁波公积金中心", projectName));

		form2.setChannel(channel);
		System.out.println("appapi00337--channel: " +  form2.getChannel() +
				"--- " + StringUtils.equalsIgnoreCase("10", channel));

		form2.setBuzType(buzType);
		System.out.println("appapi00337--buzType: " +  form2.getBuzType() +
				"--- " + StringUtils.equalsIgnoreCase("10", buzType));

		form2.setCenterId(centerId);
		System.out.println("appapi00337--centerId: " +  form2.getCenterId() +
				"--- " + StringUtils.equalsIgnoreCase("10", centerId));


		form2.setTransdate(dateFormat.format(new Date()));

		form2.setQdapprnum("YTJ" + UUID.randomUUID());

		String transdate = json.get("transdate").toString();
		form2.setTransdate(transdate);

		String loancontrnum = json.get("loancontrnum").toString();
		form2.setLoancontrnum(loancontrnum);

		String accname = json.get("accname").toString();
		form2.setAccnum(accname);

		String indiaccstate = json.get("indiaccstate").toString();
		form2.setIndiaccstate(indiaccstate);

		String addr = json.get("addr").toString();
		form2.setAddr(addr);

		String accnum1 = json.get("accnum").toString();
		form2.setAccnum(accnum1);

		String unitaccname = json.get("unitaccname").toString();
		form2.setUnitaccname(unitaccname);

		String year = json.get("year").toString();
		form2.setYear(year);

		String certinum2 = json.get("certinum").toString();
		form2.setCertinum(certinum2);

		String unitprop = json.get("unitprop").toString();
		form2.setUnitprop(unitprop);

		String recode = json.get("recode").toString();
		form2.setRecode(recode);

		String bal = json.get("bal").toString();
		form2.setBal(bal);

		String linkphone = json.get("linkphone").toString();
		form2.setLinkphone(linkphone);

		String indiprop = json.get("indiprop").toString();
		form2.setIndiprop(indiprop);

		String projectname = json.get("projectname").toString();
		form2.setProjectname(projectname);

		String amt = json.get("amt").toString();
		form2.setAmt(amt);

		String flag = json.get("flag").toString();
		form2.setFlag(flag);

		String month1 = json.get("month1").toString();
		form2.setMonth1(month1);

		String month = json.get("month").toString();
		form2.setMonth(month);

		String opnaccdate = json.get("opnaccdate").toString();
		form2.setOpnaccdate(opnaccdate);

		String linkman = json.get("linkman").toString();
		form2.setLinkman(linkman);

		String indipaysum = json.get("indipaysum").toString();
		form2.setIndipaysum(indipaysum);

		String year1 = json.get("year1").toString();
		form2.setYear1(year1);

		String basenum = json.get("basenum").toString();
		form2.setBasenum(basenum);
*/
        log.info("调用YB接口");
		/*form2.setBusinName("异地贷款缴存使用证明打印");
		form2.setAccnum("0238557595");
		form2.setBrccode("05740008");
		form2.setCertinum("330283198802270016");
		form2.setChannel("10");
		form2.setCenterId("00057400");
		form2.setCentername("宁波市住房公积金管理中心");
		form2.setProjectname("杭州");
		form2.setUserid("stgy");
		form2.setZJHM("330283198802270016");
		form2.setBuzType("5002");*/
        form2.setTransdate(dateFormat.format(new Date()));
        form2.setLoancontrnum("20201222nbbj02");
        form2.setAccnum("张杰");
        form2.setIndiaccstate("0");
        form2.setAddr("无");
        form2.setAccnum("0238557595");
        form2.setUnitaccname("宁波易才人力资源咨询有限公司");
        form2.setYear("2020");
        form2.setCertinum("330283198802270016");
        form2.setUnitprop("8.000");
        form2.setRecode("000000");
        form2.setBal("4408.76");
        form2.setLinkphone("0574-89180737");
        form2.setIndiprop("8.000");
        form2.setProjectname("瀹佹尝鍏Н閲戜腑蹇?");
        form2.setAmt("0.00");
        form2.setFlag("0");
        form2.setMonth1("08");
        form2.setMonth("05");
        form2.setOpnaccdate("2020-05-13");
        form2.setLinkman("陈倩颖");
        form2.setIndipaysum("960.00");
        form2.setYear1("2020");
        form2.setBasenum("6000.00");
        System.out.println("调用YB接口: api/appapi00337 begin.");
        form2.setBusinName("异地贷款缴存使用证明打印");
        log.info(Constants.LOG_HEAD+"api/appapi00337 begin.---------");

        HashMap map1 = BeanUtil.transBean2Map(form2);
        YbmapMessageUtil post1 = new YbmapMessageUtil();
        String url2 = PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "YBMAPURL").trim() + "appapi00337.json";
        System.out.println("YBMAP url2 ：" + url2);
        String rm2 = post1.post(url2, map1);
        System.out.println("appapi00337:开始异地贷款缴存使用证明打印接口：" + rm2);


        System.out.println("rm ：" + rm2);

        //System.out.println("异地贷款缴存使用证明打印===============" + resultMap.toString());
        JSONObject json2 = JSONObject.fromObject(rm2);
        log.info(Constants.LOG_HEAD + "appapi00337 end.");
        log.info("gbk");
        log.info("json.toString()==========" + json2.toString());
        response.getOutputStream().write(json2.toString().getBytes(request.getCharacterEncoding()));


        return;
    }
}
