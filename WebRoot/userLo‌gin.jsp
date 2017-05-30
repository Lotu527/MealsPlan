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
    
    <title>My JSP 'userLo‌gin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
     <table>
    	<tr>
    	<td>账号ID</td><td>账号名称</td><td>账号密码</td><td>账号电话</td><td>账号邮箱</td><td>账号方案</td>
    	</tr>
    	<s:iterator value="userList" var="user">
    		<tr>
    			<td><s:property value="id"/></td>
    			<td><s:property value="name"/></td>
    			<td><s:property value="password"/></td>
    			<td><s:property value="phone"/></td>
    			<td><s:property value="email"/></td>
    			<td><s:property value="planId"/></td>
    		</tr>
    	</s:iterator>
    </table>
  </body>
</html>
