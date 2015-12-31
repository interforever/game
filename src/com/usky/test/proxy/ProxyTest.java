
package com.usky.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
	
	public static void main(String[] args) {
		ProxyTest test = new ProxyTest();
		Hello sample = new Sample();
		sample = (Hello) Proxy.newProxyInstance(sample.getClass().getClassLoader(), new Class<?>[] { Hello.class }, test.new TestInvocationHandler(sample));
		sample.hello();
	}
	
	class TestInvocationHandler implements InvocationHandler {
		
		private Hello hello;
		
		public TestInvocationHandler(Hello hello) {
			this.hello = hello;
		}
		
		@Override
		public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
			System.out.println("Before hello...");
			Object result = arg1.invoke(hello, arg2);
			System.out.println("After hello...");
			return result;
		}
		
	}
	
}
