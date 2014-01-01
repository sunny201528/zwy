package com.xgs.zwy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.xgs.zwy.base.ThreadLocalVariable;


public class HibernateConfigUtils {

	private static SessionFactory sessionFactory=null;
	private HibernateConfigUtils(){
	}
	public static  void initConfiguration(){
		 sessionFactory = new  AnnotationConfiguration().configure().buildSessionFactory();
		ThreadLocalVariable.setSessionFactory(sessionFactory);
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
}
