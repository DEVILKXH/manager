/*******************************************************************************
 * $Header$
 * $Revision$
 * $Date$
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2016 Bosssoft Co, Ltd.
 * All rights reserved.
 * 
 * Created on 2016年12月1日
 *******************************************************************************/


package com.manager.inner.util;

import java.security.MessageDigest;

/**
 * TODO 此处填写 class 信息
 *
 * @author yourname (kexiaohong)
 */
public class StringUtils {
	
	public static boolean IsNullOrBlank(String str){
		if(str == null){
			return true;
		}
		if("".equals(str)){
			return true;
		}
		return false;
	}
	
	public static boolean IsNotNullAndBlank(String str){
		if(str == null){
			return false;
		}
		if("".equals(str)){
			return false;
		}
		return true;
	}

	public static String string2MD5(String inStr){  
        MessageDigest md5 = null;  
        try{  
            md5 = MessageDigest.getInstance("MD5");  
        }catch (Exception e){  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
    }
	
	public static String convertMD5(String inStr){  
		  
        char[] a = inStr.toCharArray();  
        for (int i = 0; i < a.length; i++){  
            a[i] = (char) (a[i] ^ 't');  
        }  
        String s = new String(a);  
        return s;  
    }  
}

/*
 * 修改历史
 * $Log$ 
 */