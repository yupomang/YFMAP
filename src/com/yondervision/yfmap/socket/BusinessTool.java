package com.yondervision.yfmap.socket;


import java.io.IOException;
import java.io.OutputStream;

import org.apache.log4j.Logger;

import com.yondervision.yfmap.common.exp.CenterRuntimeException;
import com.yondervision.yfmap.util.PropertiesReader;


/** 
* @ClassName: BusinessTool 
* @Description: TODO
* @author Caozhongyan
* @date Feb 5, 2015 9:01:51 AM   
* 
*/ 
public class BusinessTool {
	Logger log = Logger.getLogger("YFMAP");
//	public static final String jym = "transCode";	
//	public static final String classnameString = "GJJClient";
	
	public String BusinessSelectInsert(String message,OutputStream out) throws CenterRuntimeException{		
		String PROPERTIES_FILE_NAME = "properties.properties";
		String centerid =  PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "YFMAPServerSendMessageCenterId");
		XmlTool tool = new XmlTool();
		String code = tool.getHeadLable(message, "transCode");
		//����
		String sendSeqno = tool.getHeadLable(message, "req_no");
		//String sendSeqno = tool.getHeadLable(message, "sendSeqno");	
		log.info("BusinessTool��ȡ�ú����ϴ����Ľ�����["+code+"]");
		AbsBusinessServer absBusinessServer = AbsBusinessServer.getService(code,centerid);
		log.info("BusinessTool��ʵ��������ɹ�");
		String msg = "";
		try {
			msg = absBusinessServer.acction(message,out,centerid,sendSeqno);			
		} catch (CenterRuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return msg;
	}
	
	/**
	 * ���ͱ���
	 * 
	 * @param out
	 *            �����
	 * @param msg
	 *            ���͵ı���
	 */
	private void sendXML(OutputStream out, byte[] msg) {
		int byteSize = 4096;
		int msgLength = msg.length;
		byte[] temp = new byte[byteSize];
		int wLine = 0;
		try {
			/*
			 * ���ͳ��Ⱥͼ��ܱ�־
			 */
			String strByteSize = String.valueOf(msgLength + 1);
			/*String head = new StringBuffer().append(
					"00000000".substring(strByteSize.length())).append(
					strByteSize).append(
					this.encryptionFlag ? KMUtil.ENCRYPTION_FLAG
							: KMUtil.UN_ENCRYPTION_FLAG).toString();*/
			String head = new StringBuffer(strByteSize).append("        ".substring(strByteSize.length())).append("0").toString();
			out.write(head.getBytes());
			/*
			 * ���ͱ�����
			 */
			while (wLine < msgLength) {
				if (wLine + byteSize > msgLength) {
					temp = new byte[msgLength - wLine];
				}
				System.arraycopy(msg, wLine, temp, 0, temp.length);
				out.write(temp);
				wLine += temp.length;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
