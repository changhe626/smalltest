package com.dynamicProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class Exam implements MethodInterceptor {
	private Object target;

	public Exam(Object target) {
		super();
		this.target = target;
	}

	public Object getProxyObject() {
		// 获得代理对象生成器
		Enhancer enhancer = new Enhancer();
		// 传递类型
		enhancer.setSuperclass(target.getClass());

		// ,本类实现了接口,所以传递this进来
		enhancer.setCallback(this);
		// 返回
		return enhancer.create();
	}

	// 本类实现了这个接口,重写方法
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		long time1 = System.currentTimeMillis();
		Object invoke = arg1.invoke(target, arg2);
		long time2 = System.currentTimeMillis();
		long runtime=time2-time1;
		System.out.println("运行的时间是:"+runtime+"毫秒");
		return invoke;
	}

}
