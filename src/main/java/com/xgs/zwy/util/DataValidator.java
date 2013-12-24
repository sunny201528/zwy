package com.xgs.zwy.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

	public static boolean isString(String str){
		return true;
	}
	public static boolean isNull(Object obj){
		if(obj==null) return true;
		if(obj instanceof String){
			String str = (String) obj;
			if("".equals(str.trim())) return true;
		}
		return false;
	}
	public static boolean isNnmber(String str){
		if(isNull(str)) return false;
		String regEx = "[0-9]"; //表示a或F  
		Pattern pat = Pattern.compile(regEx);  
		Matcher mat = pat.matcher(str);  
		boolean rs = mat.find();  
		return true;
	}
	public boolean isString(String str,int length){
		return true;
	}
}
