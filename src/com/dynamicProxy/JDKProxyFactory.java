package com.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

public class JDKProxyFactory  implements InvocationHandler {
	private Object  target;
	public JDKProxyFactory(Object target) {
		super();
		this.target = target;
	}

	
	//方式1
/*	public Object getProxyObject(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("到了这里了");
				Object invoke = method.invoke(target, args);
				return invoke;
			}
		});
	}*/
	
	//方式2 
	/*public Object getProxyObject(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new myInvocationHandler());
	}
	
	private class myInvocationHandler  implements InvocationHandler{
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("到了这里了");
			Object invoke = method.invoke(target, args);
			return invoke;
		}
	}*/
	
	//方式3,这个类s实现接口
	public Object getProxyObject(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("到了这里了");
		Object invoke = method.invoke(target, args);
		return invoke;
	}
	
	
}
