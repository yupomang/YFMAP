package com.yondervision.yfmap.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class SecurityUtil {

	public static String HMAC(String secret,String message){
		String hash = null;
		try {
	        Mac sha512_HMAC = Mac.getInstance("HmacSHA512");
	        SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA512");
	        sha512_HMAC.init(secret_key);
	        hash = Base64.encodeBase64String(sha512_HMAC.doFinal(message.getBytes()));
//	        String hash = sun.misc.BASE64Encoder().encode(sha256_HMAC.doFinal(message.getBytes()));
	     }catch (Exception e){
	    	 e.printStackTrace();
	     }
	    return replace(hash);
	}
	public static String SHA(String text){
		String sha = null;
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-512");
            byte[] hash = digest.digest(text.getBytes("UTF-8"));
            sha = Base64.encodeBase64String(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
	    return replace(sha);
	}
	public static String genUUID(){
		String uuid = null;
        try {
        	uuid = UUID.randomUUID().toString().replaceAll("-", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
	    return uuid;
	}
	public static String replace(String val){
        	return val.replaceAll("\\r\\n|\\n|\\r", "");
	}

	 public static void main(String[] args) {
		 //System.out.println(genUUID());
		 //���ܺ�88�ַ��� �ù̶���12345678 ��������Ϊ003030
		 System.out.println(HMAC("12345678","003030"));
		 System.out.println(SHA("003030"));
	 }
}
