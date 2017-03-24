package com.kathir.springdependency.callableclass;

public enum BeanConstant {

	MANAGER_BEAN("com/kathir/springdependency/callableclass/ManagerBean.xml");

	private final String[] beanConstant;

	public String[] getBeanConstant() {
		return beanConstant;
	}
	
	private BeanConstant(String... error) {
		this.beanConstant = error;
	}
}
