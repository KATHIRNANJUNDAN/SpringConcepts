package com.kathir.springdependency.callableclass;

import java.sql.Connection;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanUtil {	
	 
	private static BeanUtil beanInstance = new BeanUtil();

	private BeanUtil() {}

	public static BeanUtil getInstance() {
		return beanInstance;
	}
	static Connection connection = null;	

	private static  ConcurrentHashMap<BeanConstant, ClassPathXmlApplicationContext> beanObjectCache = new ConcurrentHashMap<BeanConstant,ClassPathXmlApplicationContext>();

	public ApplicationContext getApplicationContext(BeanConstant bean) {

		ClassPathXmlApplicationContext appContext = null;
		appContext = beanObjectCache.get(bean);

		if(appContext == null) {
			appContext = new ClassPathXmlApplicationContext(bean.getBeanConstant()); 
			beanObjectCache.put(bean, appContext);
		}
		return appContext;
	}
}
