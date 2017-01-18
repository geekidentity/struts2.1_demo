package com.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class WebAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1719153972899167798L;
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	@Override
	public void setApplication(Map<String, Object> arg0) {
		request = arg0;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		application = arg0;
	}

}
