package com.kathir.springdependency.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kathir.springdependency.callableclass.BeanConstant;
import com.kathir.springdependency.callableclass.BeanUtil;
import com.kathir.springdependency.callableclass.ICallableClass;

public class DependencyInjection {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appContext = (ClassPathXmlApplicationContext) BeanUtil.getInstance().getApplicationContext(BeanConstant.MANAGER_BEAN);
		ICallableClass callableClass = (ICallableClass) appContext.getBean("CallableClass");
		callableClass.callerFromSpringDep();
	}
}

