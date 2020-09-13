package com.yondervision.yfmap.socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.common.exp.CenterRuntimeException;
import com.yondervision.yfmap.util.PropertiesReader;

public class YFMAPServerSendMessage extends AbsSocketServerService {
	Logger log = Logger.getLogger("YFMAP");	
	private String transCode;
	private boolean encryptionFlag;
	private byte[] message;
	public void run() {
		String ReqXML = null; 
		
		try {
			log.info(Constants.LOG_HEAD+"YFMAPServerSendMessage:����������ϢSOCKET����ʼ");
			InputStream in = null;
			OutputStream out = null;
			try{
				in = super.socket.getInputStream();
				out = super.socket.getOutputStream();
			}catch(IOException e2){
				e2.printStackTrace();
				CenterRuntimeException cre = new CenterRuntimeException("999999","IO���쳣");
	            throw cre;	
			}
			
			String ResXML = null;
			byte[] bResXML = null;
			boolean desjava = false;
			desjava = this.readXML(in).equals("1")?true:false;
			ReqXML = Util.getReceiveMessage(this.message, desjava);			
			log.info(Constants.LOG_HEAD+"YFMAPServerSendMessage:����������ϢSOCKET������:["+ReqXML+"]");
			String centerid = PropertiesReader.getProperty("properties.properties", "YFMAPServerSendMessageCenterId").trim();
			if("00031500".equals(centerid))
			{
				ReqXML = ReqXML.substring(0,ReqXML.length()-1);
			}
			BusinessTool bt = new BusinessTool();
			ResXML = bt.BusinessSelectInsert(ReqXML,out);	
			boolean des = PropertiesReader.getProperty("properties.properties", "YFMAPServerSendMessageDes").trim().equals("true")?true:false;
			bResXML = com.yondervision.yfmap.socket.Util.getSendMessage(ResXML, des);			
			sendXML(out, bResXML);
			log.info(Constants.LOG_HEAD+"YFMAPServerSendMessage:����������ϢSOCKET�������");
		} catch (CenterRuntimeException e1){
			e1.printStackTrace();
			log.error(Constants.LOG_ERROR+"YFMAPServerSendMessage:�������쳣:CenterRuntimeException");
			try {
				boolean des = PropertiesReader.getProperty("properties.properties", "YFMAPServerSendMessageDes").trim().equals("true")?true:false;
				SimpleDateFormat formatter1 = new SimpleDateFormat(Constants.DATE_FORMAT_YYYY_MM_DD);
				SimpleDateFormat formatter2 = new SimpleDateFormat(Constants.DATE_TIME_FORMAT_HMS);
				if(ReqXML!=null){					
					OutputStream out = super.socket.getOutputStream();
					XmlTool tool = new XmlTool();
					ReqHeadbean reqH = tool.getReqHeadbean(ReqXML);
					StringBuffer param = new StringBuffer();
					param.append("<?xml version=\"1.0\" encoding = \"UTF-8\"?><mi><head>");
					param.append("<transCode>"+reqH.getTransCode()+"</transCode>");
					param.append("<recvDate>"+formatter1.format(System.currentTimeMillis())+"</recvDate>");
					param.append("<recvTime>"+formatter2.format(System.currentTimeMillis())+"</recvTime>");
					param.append("<sendSeqno>"+reqH.getSendSeqno()+"</sendSeqno>");
					param.append("<key>"+reqH.getKey()+"</key>");
					param.append("<miSeqno>"+System.currentTimeMillis()+"</miSeqno>");
					param.append("<recode>"+e1.getErrcode()+"</recode>");
					param.append("<msg>"+e1.getMessage()+"</msg></head></mi>");
					byte[] bResXML = com.yondervision.yfmap.socket.Util.getSendMessage(param.toString(), des);
					log.error(Constants.LOG_ERROR+param.toString());
					sendXML(out, bResXML);
				}else{
					OutputStream out = super.socket.getOutputStream();					
					StringBuffer param = new StringBuffer();
					param.append("<?xml version=\"1.0\" encoding = \"UTF-8\"?><mi><head>");
					param.append("<transCode></transCode>");
					param.append("<recvDate>"+formatter1.format(System.currentTimeMillis())+"</recvDate>");
					param.append("<recvTime>"+formatter2.format(System.currentTimeMillis())+"</recvTime>");
					param.append("<sendSeqno></sendSeqno>");
					param.append("<key></key>");
					param.append("<miSeqno>"+System.currentTimeMillis()+"</miSeqno>");
					param.append("<recode>"+e1.getErrcode()+"</recode>");
					param.append("<msg>"+e1.getMessage()+"</msg></head></mi>");
					byte[] bResXML = com.yondervision.yfmap.socket.Util.getSendMessage(param.toString(), des);
					log.error(Constants.LOG_ERROR+param.toString());
					sendXML(out, bResXML);
				}			
			} catch (IOException e) {
				e.printStackTrace();
			}
		} finally {
			try {
				if (super.socket != null)
					super.socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public int getPort() {
		String PROPERTIES_FILE_NAME = "properties.properties";
		String port =  PropertiesReader.getProperty(PROPERTIES_FILE_NAME, "YFMAPServerSendMessagePort");//����SOCKET�𶯶˿�
		return Integer.parseInt(port);
	}

	/**
	 * �����ж�ȡXML
	 * 
	 * @param in
	 *            ������
	 * @param setLength
	 *            �Ƿ���볤��
	 * @return String �����ģ�������
	 * @throws IOException
	 */
	private String readXML(InputStream in) throws CenterRuntimeException {
		String returnvalue="0";
		log.info(Constants.LOG_HEAD+"YFMAPServerSendMessage:����������ϢSOCKET����*****��ȡread���Ŀ�ʼ");
		try {			
			byte[] bwcdbyte = new byte[8];
			byte[] isps = new byte[1];
			in.read(bwcdbyte);
			in.read(isps);			
			returnvalue = new String(isps);
			String strbwcd = new String(bwcdbyte);
			int TotalLen = Integer.parseInt(strbwcd.trim()) ;//- 1;
			int len = 128;
			byte[] b = new byte[len];
			this.message = new byte[TotalLen];			
			this.encryptionFlag = isps[0] == Util.ENCRYPTION_FLAG.charAt(0);
			log.info(Constants.LOG_HEAD+"YFMAPServerSendMessage:����λ"+isps[0]);
			int curLen = 0;
			while (curLen < TotalLen) {
				int t = 0;
				if (curLen + len < TotalLen) {
					t = in.read(b);
				} else {
					t = in.read(b, 0, TotalLen - curLen);
				}
				if (t == -1) {
					break;
				}
				System.arraycopy(b, 0, this.message, curLen, t);
				curLen += t;
			}			
		} catch (IOException e) {
			e.printStackTrace();
			CenterRuntimeException yqzl = new CenterRuntimeException("100003","��ȡ����SOCKET�����쳣");
            throw yqzl;			
		}	
		log.info(Constants.LOG_HEAD+"YFMAPServerSendMessage:����������ϢSOCKET����*****��ȡread���Ľ���");
		return returnvalue;
	}

	/**
	 * ���ͱ���
	 * 
	 * @param out
	 *            �����
	 * @param msg
	 *            ���͵ı���
	 */
	public void sendXML(OutputStream out, byte[] msg) {
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
			e.printStackTrace();
		} finally {
			try {
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getServiceName() {
		return "YFMAPServerSendMessage";
	}
}
