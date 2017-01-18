<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>

  </head>
  
  <body>
	<s:text name="welcome">
		<s:param value="name"></s:param>
	</s:text>
  	<s:debug></s:debug>
    <s:fielderror fieldName="name" theme=""></s:fielderror>
    <form action="helloadd.action" method="post">
    	<input type="text" name="name">
    	<input type="submit" value="submit">
    </form>
    <%-- <s:property value="errors.name[0]"/> --%>
    <s:property value="{#attr.hello}"/>
    <form action="Login-login" method="post">
    	<s:property value="getText('name')"/>:<input type="text" name="name"><br>
    	<s:property value="getText('password')"/>:<input type="password" name="password"><br>
    	<input type="submit" value="login">
    	<s:token></s:token>
    </form>
  </body>
</html>
