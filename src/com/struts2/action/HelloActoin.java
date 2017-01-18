package com.struts2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloActoin extends ActionSupport {
	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	private String name;
	private int age;
	@SuppressWarnings("unchecked")
	public HelloActoin() {
		request = (Map<String, Object>) ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
	public String execute() throws Exception {
		System.out.println(name);
		
		return "hello";	
	}
	public String add() throws Exception {
		if (name==null||!"admin".equals(name)) {
			this.addFieldError("name", "name error");
			this.addFieldError("name", "sorry");
			System.out.println("error");
		}
		request.put("hello", "request");
		session.put("hello", "session");
		application.put("hello", "application");
		try {
			throw(new Exception());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "hello";
	}
	public String delete() {
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
