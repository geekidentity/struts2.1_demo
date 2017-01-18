package com.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7590202168643231842L;
	private int num;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		num = 1;
		System.out.println(num);
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println(++num);
		long start = System.currentTimeMillis();
		String r = invocation.invoke();
		long end = System.currentTimeMillis();
		System.out.println("Action Time is"+(end-start));
		return r;
	}

}
