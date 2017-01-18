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
    
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
  	<s:fielderror fieldName="name"></s:fielderror>
    <form action="helloadd.action" method="post">
    	<input type="text" name="name">
    	<input type="submit" value="submit">
    </form>
    <s:bean name="com.struts2.entity.User" var="user">
    	<s:param name="name" value="'geek1994'"></s:param>
    	<s:property value="name"/>
    </s:bean>
    <s:set var="inPage" value="hello.html"></s:set>
    
    <s:debug></s:debug>
    <%-- <s:include value="%{#inPage}"></s:include> --%>
    <s:iterator value="{'aaa','bbb','ccc'}" var="x">
    	<s:property value="x.toUpper()"/>
    </s:iterator>
  </body>
</html>
