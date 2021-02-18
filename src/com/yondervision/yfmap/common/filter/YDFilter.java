package com.yondervision.yfmap.common.filter;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import org.springframework.web.util.NestedServletException;
import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.common.exp.CenterRuntimeException;
import com.yondervision.yfmap.common.security.AES;
import com.yondervision.yfmap.common.security.Base64Decoder;
import com.yondervision.yfmap.common.security.EncryptionByMD5;
import com.yondervision.yfmap.common.security.KeySignature;
import com.yondervision.yfmap.common.security.RSASignature;
import com.yondervision.yfmap.common.security.SecurityCheck;
import com.yondervision.yfmap.common.security.SecurityCheckManager;
import com.yondervision.yfmap.util.CommonUtil;
import com.yondervision.yfmap.util.PropertiesReader;

public class YDFilter implements Filter {

	private FilterConfig filterConfig = null;
	

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		SecurityCheckManager.init();
	}
	
	public void destroy() { 
		SecurityCheckManager.destroy();
	}
 
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		  try {			  
			  HttpServletRequest request1 = (HttpServletRequest)request;
			  String path = request1.getServletPath();
			  System.out.println("前置机请求方法："+path);
//			  if(request1.getServletPath().startsWith("/appapi00101")){
//				  chain.doFilter(request1, response);
//			  }else 
			//校验安全处理2017-07-27syw
			SecurityCheck securityCheck = new SecurityCheck();
			HashMap<String,String> checkMap = securityCheck.securityService(request1,(HttpServletResponse)response,filterConfig);
			if(!"000000".equals(checkMap.get("recode")))
			{
	//				response.setContentType("text/plain; charset=utf-8");
	//				response.setCharacterEncoding("utf-8");
	//				JSONObject obj = new JSONObject();
	//				obj.put("recode", Constants.ERROR_999999);
	//				obj.put("msg", checkMap.get("msg"));
	//				response.getWriter().print(obj.toString());
				throw new CenterRuntimeException(Constants.ERROR_999999, checkMap.get("msg"));
	//					throw new NoRollRuntimeErrorException(WEB_ALERT.SELF_ERR
	//							.getValue(), checkMap.get("msg"));
				//return;
			}
			 if(request1.getServletPath().startsWith("/appapi40102")|| request1.getServletPath().startsWith("/appapi40104")
					  || request1.getServletPath().startsWith("/appapi40117")||request1.getServletPath().startsWith("/appapi40111")
					  ||request1.getServletPath().startsWith("/appapi00906")||request1.getServletPath().startsWith("/appapi00907")
					  ||request1.getServletPath().startsWith("/appapi00910")||request1.getServletPath().startsWith("/appapi40109")
					  ||request1.getServletPath().startsWith("/appapi40112")||request1.getServletPath().startsWith("/appapi40113")
					  ||request1.getServletPath().startsWith("/appapi40114")||request1.getServletPath().startsWith("/appapi01022")
					  ||request1.getServletPath().startsWith("/appapi01050")||request1.getServletPath().startsWith("/appapi01034")
					  ||request1.getServletPath().startsWith("/appapi01026")){
				  chain.doFilter(request1, response);
			  }else if (request1.getServletPath().startsWith("/appapi801") || request1.getServletPath().startsWith("/appapi802")){
				  chain.doFilter(request1, response);
			  }else if(request1.getServletPath().startsWith("/webapi500")||path.startsWith("/appapi50023")){
				  chain.doFilter(request1, response);
			  }else if (request1.getServletPath().startsWith("/appapi101")||request1.getServletPath().startsWith("/appapi008")){
				  chain.doFilter(request1, response);
			  }else if(path.startsWith("/appapi50010")||path.startsWith("/appapi50011")||path.startsWith("/appapi50012")||
					  path.startsWith("/appapi50013")||path.startsWith("/appapi50014")||path.startsWith("/appapi50015")||
					  path.startsWith("/appapi50016")||path.startsWith("/appapi50017")||path.startsWith("/appapi50018")||
					  path.startsWith("/appapi50019")||path.startsWith("/appapi50006")||path.startsWith("/appapi50007")||
					  path.startsWith("/appapi50009")||path.startsWith("/appapi50022")||path.startsWith("/appapi50004")||
					  path.startsWith("/appapi50024")||path.startsWith("/appapi50025")||path.startsWith("/appapi50030")||
					  path.startsWith("/appapi50031")){
				  chain.doFilter(request1, response);				  
			 }
			 else if(path.startsWith("/appapi30290")||path.startsWith("/appapi30291")||path.startsWith("/appapi30292")||path.startsWith("/appapi00199")
					  ||path.startsWith("/appapi62591")||path.startsWith("/appapi62592")
					  ||path.startsWith("/appapi62593")||path.startsWith("/appapi00105")||path.startsWith("/appapi00106")
					  ||path.startsWith("/appapi00111")||path.startsWith("/appapi00112")||path.startsWith("/appapi00113")
					  ||path.startsWith("/appapi00114")||path.startsWith("/appapi00115")||path.startsWith("/appapi00116")
					  ||path.startsWith("/appapi00117")||path.startsWith("/appapi00118")||path.startsWith("/appapi07030")
					  ||path.startsWith("/appapi00132")||path.startsWith("/appapi00133")||path.startsWith("/appapi00138")
					  ||path.startsWith("/appapi00136")||path.startsWith("/appapi00137")||path.startsWith("/appapi00139")||path.startsWith("/appapi00176")||path.startsWith("/appapi00177")
					  ||path.startsWith("/appapi00140")||path.startsWith("/appapi00141")||path.startsWith("/appapi00135")||path.startsWith("/appapi00143")||path.startsWith("/appapi00175")
					  ||path.startsWith("/appapi00144")||path.startsWith("/appapi00145")||path.startsWith("/appapi00147")
					  ||path.startsWith("/appapi00148")||path.startsWith("/appapi00149")||path.startsWith("/appapi00150")
					  ||path.startsWith("/appapi00151")||path.startsWith("/appapi00152")||path.startsWith("/appapi00153")
					  ||path.startsWith("/appapi00154")||path.startsWith("/appapi00155")||path.startsWith("/appapi00156")
					  ||path.startsWith("/appapi00157")||path.startsWith("/appapi00158")||path.startsWith("/appapi00159")
					  ||path.startsWith("/appapi00160")||path.startsWith("/appapi00161")||path.startsWith("/appapi00162")
					  ||path.startsWith("/appapi00163")||path.startsWith("/appapi00164")||path.startsWith("/appapi00165")
					  ||path.startsWith("/appapi00166")||path.startsWith("/appapi00167")||path.startsWith("/appapi00168")
					  ||path.startsWith("/appapi00169")||path.startsWith("/appapi00170")||path.startsWith("/appapi00203")||path.startsWith("/appapi00204")
					  ||path.startsWith("/appapi00205")||path.startsWith("/appapi00206")||path.startsWith("/appapi00207")||path.startsWith("/appapi00337")
					  ||path.startsWith("/appapi00208")||path.startsWith("/appapi00209")||path.startsWith("/appapi00210")||path.startsWith("/appapi00211")
					  ||path.startsWith("/appapi00212")||path.startsWith("/appapi00213")||path.startsWith("/appapi00172")||path.startsWith("/appapi10000")||path.startsWith("/appapi10001")
					  ||path.startsWith("/appapi00214")||path.startsWith("/appapi00215")||path.startsWith("/appapi00216")||path.startsWith("/appapi00217")||path.startsWith("/appapi00218")||path.startsWith("/appapi00179")
					  ||path.startsWith("/appapi00219")||path.startsWith("/appapi00220")||path.startsWith("/appapi10002")||path.startsWith("/appapi00221")||path.startsWith("/appapi00239")||path.startsWith("/appapi00178")
					  ||path.startsWith("/appapi00222")||path.startsWith("/appapi00223")||path.startsWith("/appapi00224")||path.startsWith("/appapi00225")||path.startsWith("/appapi00226")
					  ||path.startsWith("/appapi00227")||path.startsWith("/appapi00229")||path.startsWith("/appapi00233")||path.startsWith("/appapi00234")||path.startsWith("/appapi00236")||path.startsWith("/appapi00237")
					  ||path.startsWith("/appapi00250")||path.startsWith("/appapi00251")||path.startsWith("/appapi00252")||path.startsWith("/appapi00253")||path.startsWith("/appapi00254")||path.startsWith("/appapi00255")
			 )
			 {
				  String aa=request.getParameter("channel");
				  System.out.println("channel=============="+aa);
				  if(!"40".equals(aa)&&!"53".equals(aa)){
					  System.out.println("核心调用字符集改为GBK");
					  request1.setCharacterEncoding("GBK");
					  response.setCharacterEncoding("GBK");
				  }
				  chain.doFilter(request1, response);
			 }else if (path.startsWith("/exchange")){
				  request1.setCharacterEncoding("GBK");
				  response.setCharacterEncoding("GBK");
				  chain.doFilter(request1, response);
			 }else if (path.startsWith("/webapi80001")||path.startsWith("/webapi80002")||path.startsWith("/webapi80003")
					 ||path.startsWith("/webapi80005")||path.startsWith("/webapi80009")||path.startsWith("/webapi80010")
					 ||path.startsWith("/webapi80006")||path.startsWith("/webapi80007")||path.startsWith("/webapi80008")
					 ||path.startsWith("/webapi90001")||path.startsWith("/appapi00228")||path.startsWith("/appapi00235")
					 ||path.startsWith("/appapi00240")||path.startsWith("/appapi00241")||path.startsWith("/appapi00242")
					 ||path.startsWith("/appapi00243")||path.startsWith("/appapi00244")||path.startsWith("/appapi00245")
			 ){
				  request1.setCharacterEncoding("GBK");
				  response.setCharacterEncoding("GBK");
				  chain.doFilter(request1, response); 
			  }else if (path.startsWith("/webapi80004")||path.startsWith("/webapi80015")){
				  request1.setCharacterEncoding("UTF-8");
				  response.setCharacterEncoding("GBK");
				  chain.doFilter(request1, response); 
			  }else if (path.startsWith("/heartbeat")){
				  request1.setCharacterEncoding("GBK");
				  response.setCharacterEncoding("GBK");
				  chain.doFilter(request1, response); 
			  }else{
				  StringBuffer values = new StringBuffer();
				  String paras = request1.getHeader("headpara");
				  String headMD5 = request1.getHeader("headparaMD5");
				  System.out.println("******************1");
				  //System.out.println(request1.getHeader("KeySignature"));			  
				  byte[] data = Base64Decoder.decodeToBytes(request1.getHeader("KeySignature"));
				  System.out.println("******************2");
				  boolean status = KeySignature.verify(headMD5.getBytes(), data, PropertiesReader.getProperty("properties.properties", "certificatePath").trim());
				  System.out.println("签名证书验证："+status);
				  if(!status)
						throw new CenterRuntimeException(Constants.ERROR_999999, "中心前置证书签名验证失败");
				  if(paras==null)
						throw new CenterRuntimeException(Constants.ERROR_999999, "中心前置请求信息包头不正确");
				  
					String[] par = paras.split(",");
					
					for(int i=0;i<par.length;i++){			
						if(i!=0){
							values.append("&");
						}						
						values.append(par[i]+"="+request.getParameter(par[i]));
					}				
					if(headMD5==null)
						throw new CenterRuntimeException(Constants.ERROR_999999, "中心前置请求信息包头不正确");
					String paraMD5 = EncryptionByMD5.getMD5(values.toString().getBytes("UTF-8"));
					System.out.println("values : "+values.toString());
					System.out.println("paraMD5 : "+paraMD5);
					System.out.println("headMD5 : "+headMD5);
					//住建委网站不校验签名
					if (!"30".equals(request.getParameter("channel"))){
						 if(RSASignature.doCheck(paraMD5, headMD5, RSASignature.RSA_ALIPAY_PUBLIC)){            
					            System.out.println("APP前置==============================APP签名验证成功");
					        }else{
					         	System.out.println("APP前置==============================APP签名验证失败");
					        	throw new CenterRuntimeException(Constants.ERROR_999999, "中心前置请求APP签名验证不正确");
					        }	
					}
					
					HttpServletRequest req=(HttpServletRequest) request;
					HashMap m=new HashMap(request.getParameterMap());
					System.out.println("城市中心代码："+request.getParameter("centerId"));
					System.out.println("channel代码："+request.getParameter("channel"));
					if("00087100".equals(request.getParameter("centerId"))
							||"00073300".equals(request.getParameter("centerId"))
							||"00066800".equals(request.getParameter("centerId"))
							||"00077500".equals(request.getParameter("centerId"))
							||"00057400".equals(request.getParameter("centerId"))){
						AES aes = new AES(request.getParameter("centerId") , request.getParameter("channel") , null ,null);
						if(!CommonUtil.isEmpty(m.get("userId"))){
							System.out.println("userId : "+request.getParameter("userId"));
							String usid = (String)request.getParameter("userId");
							m.remove("userId");					
							//针对住建委网站加密问题修改 xzw
							if (!"30".equals(req.getParameter("channel"))) {
								m.put("userId", aes.decrypt(usid));
							}else{
								m.put("userId",usid);
							}
						}
						
					}else{
						AES aes = new AES();
						if(!CommonUtil.isEmpty(m.get("userId"))){
							System.out.println("userId : "+request.getParameter("userId"));
							String usid = (String)request.getParameter("userId");
							m.remove("userId");					
							//针对住建委网站加密问题修改 xzw
							if (!"30".equals(req.getParameter("channel"))) {
								m.put("userId", aes.decrypt(usid));
							}else{
								m.put("userId",usid);
							}
						}
						if(!CommonUtil.isEmpty(m.get("surplusAccount"))){
							System.out.println("surplusAccount : "+request.getParameter("surplusAccount"));
							String idcNumber = (String)request.getParameter("surplusAccount");
							m.remove("surplusAccount");
							m.put("surplusAccount", aes.decrypt(idcNumber));
						}
					}
					
					ParameterRequestWrapper wrapRequest=new ParameterRequestWrapper(req,m);
			        chain.doFilter(wrapRequest, response);
			  }	  
		  }catch(NestedServletException e2) {
			  if (!(e2.getRootCause() instanceof CenterRuntimeException)) {
					e2.getRootCause().printStackTrace();					
			  }  
			  doErr(e2, request, response);
		  }catch(CenterRuntimeException e) {	
			  doErr(  e,  request,   response);
		  }catch(Exception e) {
			   e.printStackTrace();
			   CenterRuntimeException ce = new CenterRuntimeException(Constants.ERROR_999999, "中心前置请求请求过滤器处理异常");
			   doErr(  ce,  request,   response);
		  }

	}
	
	private void doErr(Exception e,ServletRequest request, ServletResponse response) throws IOException{
		String errcode="999999";
		String msg=e.getMessage();
		int wz = msg.indexOf("Exception:");
		if (wz > 0)
			wz += 10;
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		JSONObject obj = new JSONObject();
		obj.put("recode", errcode );
		if (wz > 0)
			obj.put("msg", msg.substring(wz));
		else
			obj.put("msg", msg);
		obj.put("rows", new net.sf.json.JSONArray());
		obj.put("total", Integer.parseInt("0"));
		response.getWriter().print(obj.toString());
	} 

}
