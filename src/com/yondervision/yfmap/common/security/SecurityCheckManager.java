/**
 * 文件名：SecurityCheckManager.java
 * 功能     ：   安全检查核心类
 * */
package com.yondervision.yfmap.common.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Properties;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurityCheckManager {

	// 特殊字符匹配
	private static Pattern CHECK_PATTERN;
	// 是否开启校验功能
	public static boolean IS_CHECK;
	// 是否开启header校验
	public static boolean IS_CHECK_HEADER;
	// 是否开启parameter校验
	public static boolean IS_CHECK_PARAMETER;
	// 是否开启host校验
	public static boolean IS_CHECK_HOST;
	// 是否开启referer校验 针对referer的跨站点请求伪造，增加判断方法  2015-10-23 by LXH
	public static boolean IS_CHECK_REFERER;
	// 是否记录日志
	public static boolean IS_LOG;

	// 日志路径
	public static String LOGPATH;
	// 错误页面
	public static String ERRORPAGE;

	private static Properties prop = null;

	public static Vector<String> HEADERWHITE = new Vector();

	public static Vector<String> PARAMETERWHITE = new Vector();

	public static Vector<String> HOSTWHITE = new Vector();

	public static Vector<String> SPECIAL_URL = new Vector();
	
	public static Vector<String> REFERERWHITE = new Vector();  //referer白名单 针对referer的跨站点请求伪造，增加判断方法  2015-10-23 by LXH

	public static void init() {
		System.out.println("进入 SecurityCheckManager init 方法");
		prop = new Properties();
		try {
			// 采用绝对路径的方式，以解决properties文件缓存无法动态重新加载问题
			String filePath = SecurityCheckManager.class
					.getResource("/securityCheck.properties").toURI()
					.getPath();
			InputStream is = new FileInputStream(new File(filePath));
			prop.load(is);
			is.close();
		} catch (NullPointerException e) {
			System.err.println("资源文件securityCheck.properties没有找到！");
			e.printStackTrace();
		} catch (URISyntaxException e) {
			System.err.println("获取文件securityCheck.properties的URI异常！");
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			System.err.println("资源文件securityCheck.properties没有找到！");
			e1.printStackTrace();
		} catch (IOException e) {
			System.err.println("加载资源文件securityCheck.properties失败！");
			e.printStackTrace();
		}

		int regexCount = Integer.parseInt(prop.get("regexCount") + "");
		StringBuffer regexSb = new StringBuffer();
		for (int i = 1; i <= regexCount; i++) {
			if (i > 1)
				regexSb.append("|");
			regexSb.append(prop.get("regex" + i));
		}
		String regex = regexSb.toString();
		CHECK_PATTERN = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		IS_CHECK = Boolean.valueOf(prop.get("isCheck") + "");
		IS_LOG = Boolean.valueOf(prop.get("isLog") + "");
		IS_CHECK_HEADER = Boolean.valueOf(prop.get("isCheckHeader") + "");
		IS_CHECK_PARAMETER = Boolean.valueOf(prop.get("isCheckParameter") + "");
		IS_CHECK_HOST = Boolean.valueOf(prop.get("isCheckHost") + "");
		//是否check referer值 针对referer的跨站点请求伪造，增加判断方法  2015-10-23 by LXH
		IS_CHECK_REFERER = Boolean.valueOf(prop.get("isCheckReferer") + "");
		if (prop.get("header.whitename") != null) {
			String[] names = prop.get("header.whitename").toString().split(",");
			for (int i = 0; i < names.length; i++) {
				HEADERWHITE.add(names[i]);
			}
		}
		if (prop.get("parameter.whitename") != null) {
			String[] names = prop.get("parameter.whitename").toString()
					.split(",");
			for (int i = 0; i < names.length; i++) {
				PARAMETERWHITE.add(names[i]);
			}

		}
		if (prop.get("host.whitename") != null) {
			String[] names = prop.get("host.whitename").toString().split(",");
			for (int i = 0; i < names.length; i++) {
				HOSTWHITE.add(names[i]);
			}

		}
		
		//获取referer白名单 针对referer的跨站点请求伪造，增加判断方法  2015-10-23 by LXH
		if (prop.get("referer.whitename") != null) {
			String[] names = prop.get("referer.whitename").toString().split(",");
			for (int i = 0; i < names.length; i++) {
				REFERERWHITE.add(names[i]);
			}

		}
		
		LOGPATH = prop.get("logPath") + "";
		ERRORPAGE = prop.get("errorPage") + "";
		if (prop.get("specialCount") != null) {
			int specialCount = Integer.parseInt(prop.get("specialCount") + "");
			for (int i = 0; i < specialCount; i++) {
				if (prop.get("special" + (i + 1)) != null) {
					String url = (String) prop.get("special" + (i + 1));
					SPECIAL_URL.add(url);
				}
			}

		}

		System.out.println("离开 SecurityCheckManager init 方法");
	}

	public static boolean matches(String input) {
		Matcher m = CHECK_PATTERN.matcher(input);
		return m.find();
	}
	
	public static void main(String[] args) {
		String regx = "<script>.*</script>|\n|alert|select|delete|update|insert|exec|drop|count|script|join|union|truncate|password| and | or |cat |etc";
		String input = "192.8.1.25   WB1437677312 luN7OOQt1UN4SA76MNMvM2M1OGQwYzE2MTU5NDI1MWI4NjZiMTZmNjU1ZTEyODYpJUPLtupCuZZ8tFwnIkW6Y8cS1a 3qScaDp3d2E29XfxED3tAmeES6r7AQS65jwYi59b+BQ= sina 5751 木子的穆紫 00087100 10 null 3  M/AvFC8iRoN4RrspXGokCf0xoB8V8+ksF28r/0Pw16tiis88mEEh+pF1wDpI4jXo  #你问我答#【公积金缴纳】\n请问下，我老公因为生病请假了，单位没有帮交住房公积金，过去一年没有缴纳的费用，自己是否可以补缴？ 1  1.0 80 ";
		Pattern p = Pattern.compile(regx, Pattern.CASE_INSENSITIVE); 
		Matcher m = p.matcher(input);
		System.out.println(m.find());
		System.out.println(m.group());
	}

	public static void destroy() {
		CHECK_PATTERN = null;
		IS_CHECK = false;
		IS_LOG = false;
		IS_CHECK_HEADER = false;
		IS_CHECK_PARAMETER = false;
		LOGPATH = null;
		ERRORPAGE = null;
		HEADERWHITE = new Vector();
		PARAMETERWHITE = new Vector();
		HOSTWHITE = new Vector();
		SPECIAL_URL = new Vector();
	}

	public static void reload() {
		destroy();
		init();
	}
}
