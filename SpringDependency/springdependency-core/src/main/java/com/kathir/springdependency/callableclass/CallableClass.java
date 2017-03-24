package com.kathir.springdependency.callableclass;

public class CallableClass implements ICallableClass{

	public void callerFromSpringDep() {
		
		System.out.println("Callable statement from Depen Inj Class");
	}
}
