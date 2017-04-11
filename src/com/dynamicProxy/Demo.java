package com.dynamicProxy;

import org.junit.Test;

public class Demo {
	
	@Test
	public void test() {
		long long1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			CglibProxyFactory proxyFactory = new CglibProxyFactory(new CustomerService());
			CustomerService proxy = (CustomerService) proxyFactory.getProxyObject();
			proxy.find();
			proxy.save();
		}
		long long2 = System.currentTimeMillis();
		long time = long2 - long1;
		System.out.println(time);   //752     669  695  751
		
	}

	
	//JDK代理的效率更高!!!!!!!!!!!!!!
	@Test
	public void test2(){
		  long long1 = System.currentTimeMillis();
		  for(int i=0;i<10000;i++){
			  JDKProxyFactory proxyFactory = new  JDKProxyFactory(new CustomerService());
			  ICustomerService proxy = (ICustomerService) proxyFactory.getProxyObject();
			  proxy.find();
			  proxy.save();
		  }
		  long long2 = System.currentTimeMillis();
		  long time=long2-long1;
		  System.out.println(time);   //642    459   464   440
	}

	
}
