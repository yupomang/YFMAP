package com.yondervision.yfmap.handle.handleImpl.handle00057400;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.ui.ModelMap;

import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.common.FtpUtil;
import com.yondervision.yfmap.common.exp.CenterRuntimeException;
import com.yondervision.yfmap.common.mess.CommunicateUtil;
import com.yondervision.yfmap.common.security.AES;
import com.yondervision.yfmap.form.AppApi030Form;
import com.yondervision.yfmap.form.AppApiCommonForm;
import com.yondervision.yfmap.handle.CtrlHandleInter;
import com.yondervision.yfmap.messagectrl.MessageCtrMain;
import com.yondervision.yfmap.result.TitleInfoNameFormatBean;
import com.yondervision.yfmap.result.ningbo.AppApi03824ZHResult;
import com.yondervision.yfmap.util.BeanUtil;
import com.yondervision.yfmap.util.Channel;
import com.yondervision.yfmap.util.CommonUtil;
import com.yondervision.yfmap.util.JavaBeanUtil;
import com.yondervision.yfmap.util.JsonUtil;
import com.yondervision.yfmap.util.PropertiesReader;

public class Handle03824_00057400 implements CtrlHandleInter {
	Logger log = Logger.getLogger("YFMAP");
	//属性文件
	private static final ResourceBundle ReadProperties;		
	static{
	//读取属性文件
		ReadProperties = ResourceBundle.getBundle("ftp");
	}
	public ModelMap action(AppApiCommonForm form1, ModelMap modelMap) throws CenterRuntimeException,Exception{
		String PROPERTIES_FILE_NAME = "properties.properties";
		AppApi030Form form = (AppApi030Form)form1;
		log.debug("form:"+form);
		String send = PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapi001Send"+form.getCenterId()).trim();
		AppApi03824ZHResult app03824ZHResult = new AppApi03824ZHResult();
		if(Constants.method_BSP.equals(send)){

			String msgType = PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapi001MsgType"+form.getCenterId()).trim();			
			form.setKey(PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapi001Key"+form.getCenterId()).trim());
			SimpleDateFormat formatter1 = new SimpleDateFormat("yyyyMMdd");
			SimpleDateFormat formatter2 = new SimpleDateFormat("hhmmss");
			Date date = new Date();
			form.setSendDate(formatter1.format(date));
			form.setSendTime(formatter2.format(date));
			String req = form.getUserId()+CommonUtil.getSystemDateNumOnly();
			form.setSendSeqno(req);
			form.setType(PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapi001Type"+form.getCenterId()).trim());			
			AES aes = new AES(form.getCenterId() ,form.getChannel() ,form.getAppid() ,null);		
			if(!"1".equals(form.getAESFlag()) && (!CommonUtil.isEmpty(form.getClientIp()))){
				form.setClientIp(aes.decrypt(form.getClientIp()));
			}
			if((!form.getChannel().trim().equals("40"))&&(!form.getChannel().trim().equals("92"))&&(!form.getChannel().trim().equals("96"))&&(!form.getChannel().trim().equals("52"))&&(!form.getChannel().trim().equals("91")))
			{
				form.setChannelSeq(form.getSendSeqno());
				form.setTellCode("9999");
				form.setBrcCode("05740008");
				form.setClientMAC("");
//				form.setTellCode(PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapi001TellCode"+form.getCenterId()).trim());
//				form.setBrcCode(PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapi001BrcCode"+form.getCenterId()).trim());
				form.setTranDate(form.getSendDate());
			}
			form.setFlag(Channel.getChannel(form.getChannel()));
			
			HashMap map = BeanUtil.transBean2Map(form);
			map.put("tellcode", "wtgy");
			//map.put("tellcode", PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "appapichannel"+form.getChannel()).trim());
		    String xml = MessageCtrMain.encapsulatedPackets(msgType, CommonUtil.getFullURL(Constants.msgPath+form.getCenterId())+"/BSP_REQ_ZGZFGJJJCQKZM.txt", map, req);
			//String xml = MessageCtrMain.encapsulatedPackets(msgType, "D:/workzone/YFMAP/src/com/yondervision/yfmap/config/messagetemp/00057400/BSP_REQ_ZGZFGJJJCQKZM.txt", map, req);
			log.debug("前置YFMAP发往中心报文："+xml);			
			String ip = PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "BSP_SOCKET_IP"+form.getCenterId()).trim();
			String port = PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "BSP_SOCKET_PORT"+form.getCenterId()).trim();
			String rexml = CommunicateUtil.sendMessage(send, ip, Integer.parseInt(port), xml, "128103");
			
			//String rexml ="<AuthCode1>1200</><AuthCode2>1200</><AuthCode3>1200</><AuthFlag>0</><BrcCode>05740008</><BusiSeq>105933</><ChannelSeq>12373581</><ChkCode>1200</><MTimeStamp>2017-09-15 16:57:52:635629</><NoteMsg></><RspCode>000000</><RspMsg>交易处理成功...</><STimeStamp>2017-09-05 18:12:47:745000</><TellCode>1200</><TranChannel>0</><TranCode>128103</><TranDate>2017-08-27</><TranIP>172.16.8.101</><TranSeq>105933</><accname>王小猛</><accnum>0116465583</><addr>无</><amt>0.00</><bal>15704.12</><basenum>8356.00</><certinum>412724198508088394</><flag>0</><indiaccstate>0</><indipaysum>2006.00</><indiprop>12.000</><loancontrnum>20170827nbbj03</><month></><month1></><opnaccdate>2013-09-16</><projectname>测试住房公积金中心</><unitaccname>中华人民共和国宁波海事局</><unitprop>12.000</><year></><year1></>";
			log.debug("前置YFMAP接收中心报文——职工住房公积金缴存情况证明："+rexml);
		    HashMap resultMap = MessageCtrMain.analysisPacket(msgType, CommonUtil.getFullURL(Constants.msgPath+form.getCenterId())+"/BSP_REP_ZGZFGJJJCQKZM.txt", rexml, req);
		    //HashMap resultMap = MessageCtrMain.analysisPacket(msgType, "D:/workzone/YFMAP/src/com/yondervision/yfmap/config/messagetemp/00057400/BSP_REP_ZGZFGJJJCQKZM.txt", rexml, req);
			log.debug("解析报文MAP："+resultMap);
			BeanUtil.transMap2Bean(resultMap, app03824ZHResult);
			log.debug("MAP封装成BEAN："+app03824ZHResult);
			if(!"0".equals(app03824ZHResult.getRecode())){
				modelMap.clear();
				modelMap.put("recode", app03824ZHResult.getRecode());
				modelMap.put("msg", "错误信息："+app03824ZHResult.getMsg());
				log.error("中心返回报文 状态recode :"+app03824ZHResult.getRecode()+"  ,  描述msg : "+app03824ZHResult.getMsg());
				return modelMap;
			}
		}
		
		modelMap.clear();
		modelMap.put("recode", "000000");
		modelMap.put("msg", "成功");
		modelMap.put("accname", app03824ZHResult.getAccname());
		modelMap.put("accnum", app03824ZHResult.getAccnum());
		modelMap.put("addr", app03824ZHResult.getAddr());
		modelMap.put("amt", app03824ZHResult.getAmt());
		modelMap.put("bal", app03824ZHResult.getBal());
		modelMap.put("basenum", app03824ZHResult.getBasenum());
		modelMap.put("certinum", app03824ZHResult.getCertinum());
		modelMap.put("flag", app03824ZHResult.getFlag());
		modelMap.put("indiaccstate", app03824ZHResult.getIndiaccstate());
		modelMap.put("indipaysum", app03824ZHResult.getIndipaysum());
		modelMap.put("indiprop", app03824ZHResult.getIndiprop());
		modelMap.put("loancontrnum", app03824ZHResult.getLoancontrnum());
		modelMap.put("month", app03824ZHResult.getMonth());
		modelMap.put("month1", app03824ZHResult.getMonth1());
		modelMap.put("opnaccdate", app03824ZHResult.getOpnaccdate());
		modelMap.put("projectname", app03824ZHResult.getProjectname());
		modelMap.put("unitaccname", app03824ZHResult.getUnitaccname());
		modelMap.put("unitprop", app03824ZHResult.getUnitprop());
		modelMap.put("year", app03824ZHResult.getYear());
		modelMap.put("year1", app03824ZHResult.getYear1());
		modelMap.put("linkman", app03824ZHResult.getLinkman());
		modelMap.put("linkphone", app03824ZHResult.getLinkphone());
		modelMap.put("transdate", app03824ZHResult.getTransdate());
		
		return modelMap;
	}
	
	/*public static void main(String[] args){
		AppApi030Form form1 = new AppApi030Form();
		ModelMap modelMap = new ModelMap();
		form1.setCenterId("00057400");
		form1.setUserId("123456");
		form1.setChannel("40");
		form1.setUnitaccnum("11111");
	
		Handle03824_00057400 hand = new Handle03824_00057400();
		try {
			System.out.println(JsonUtil.getGson().toJson(hand.action(form1, modelMap)));
		} catch (CenterRuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
}
