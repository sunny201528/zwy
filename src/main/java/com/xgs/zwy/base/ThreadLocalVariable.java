package com.xgs.zwy.base;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import com.xgs.zwy.core.GlobalValue;
import com.xgs.zwy.domain.SystemSetting;

public class ThreadLocalVariable {
private static ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();

public static void cleanThreadLocal(){
	threadLocal.remove();
}

public static void setSystemSetting(Object session){
	setValue(GlobalValue.SYSTEMSETTING, session);
}

public static SystemSetting getSystemSetting(){
	return getValue(GlobalValue.SYSTEMSETTING);
}

@SuppressWarnings({ "rawtypes", "unchecked"})
private static <K,V> void  setValue(K key, V value){
	Map map = (Map) threadLocal.get();
	if (map == null) {
		map = new HashMap();
}
	V newValue = null;
	try {
		if(value!=null){
			newValue = (V) value.getClass().newInstance();
		}
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	}
	BeanUtils.copyProperties(newValue, value);
	map.put(key, newValue);
	threadLocal.set(map);
}

@SuppressWarnings({ "unchecked", "rawtypes" })
public static <K,V> V getValue(K key){
	Map map = (Map) threadLocal.get();
	if (map != null) {
		return (V) map.get(key);
}
	return null;
	
}
}
