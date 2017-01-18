package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private String name;
	private String password;
	public String login() throws NullPointerException {
		System.out.println(name);
		System.out.println(password);
		return "login";
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
