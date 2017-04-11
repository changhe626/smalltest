package com.dynamicProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxyFactory   implements MethodInterceptor{
	private Object  target;
	public CglibProxyFactory(Object target) {
		super();
		this.target = target;
	}
	
	
	public Object getProxyObject(){
		//获得代理对象生成器
		Enhancer enhancer = new Enhancer();
		//传递类型
		enhancer.setSuperclass(target.getClass());
		
		//方法1
		/*	enhancer.setCallback(new MethodInterceptor(){
			@Override
			public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
				System.out.println("对日志进行了记录了");
				Object invoke = arg1.invoke(target, arg2);
				return invoke;
			}
		});*/
		
		
		//设置回调方法,方法2
	//	enhancer.setCallback(new myMethodInterceptor());
		//方法3
	enhancer.setCallback(this);
		//返回
		return enhancer.create();
	}
	
	
	//方法2,内部类实现了这个接口
	/*private  class  myMethodInterceptor  implements MethodInterceptor{
		@Override
		public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
			System.out.println("对日志进行了记录了");
			Object invoke = arg1.invoke(target, arg2);
			return invoke;
		}
	}*/

	//方法3,本类实现了这个接口
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("对日志进行了记录了");
		Object invoke = arg1.invoke(target, arg2);
		return invoke;
	}
	
	
}
