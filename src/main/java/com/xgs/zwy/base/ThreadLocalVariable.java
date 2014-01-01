package com.xgs.zwy.base;

import org.hibernate.SessionFactory;

import com.xgs.zwy.domain.SystemSetting;

public class ThreadLocalVariable {
//private static ThreadLocal<Object> threadLocal = new ThreadLocal<Object>();

private static SystemSetting systemSetting = null;

private static SessionFactory sessionFactory =null;
public static void cleanThreadLocal(){
//	threadLocal.remove();
	systemSetting=null;
	sessionFactory =null;
}

public static void setSystemSetting(SystemSetting setting){
	systemSetting=setting;
}

public static SystemSetting getSystemSetting(){
//	return getValue(GlobalValue.SYSTEMSETTING);
	return systemSetting;
}
public static void setSessionFactory(SessionFactory factory){
	sessionFactory = factory;
//	setValue(GlobalValue.SESSIONFACTORY, session);
}

public static SessionFactory getSessionFactory(){
	return sessionFactory;
}

//@SuppressWarnings({ "rawtypes", "unchecked"})
//private static <K,V> void  setValue(K key, V value){
//	Map map = (Map) threadLocal.get();
//	if (map == null) {
//		map = new HashMap();
//}
//	map.put(key, value);
//	threadLocal.set(map);
//}

//@SuppressWarnings({ "unchecked", "rawtypes" })
//public static <K,V> V getValue(K key){
//	Map map = (Map) threadLocal.get();
//	if (map != null) {
//		return (V) map.get(key);
//}
//	return null;
//	
//}
}
