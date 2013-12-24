package com.xgs.zwy.util;

public class XMLUtils {

	private XMLUtils() {
	}

	public static String toXmlContext(String text){
		if(text==null){
			return "";
		}
		return text.trim();
	}
}
