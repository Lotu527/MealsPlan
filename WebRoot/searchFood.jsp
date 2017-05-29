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
    
    <title>My JSP 'searchFood.jsp' starting page</title>
    
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
   	<td>
     食品编号
    </td>
    <td>
     食品名称
    </td>    
    <td>
     食品类别1
    </td>
    <td>
     食品类别2
    </td>
    <td>
     食品价格（元）
    </td>
    <td>
     食品质量（克）
    </td>
    <td>
     食品能量（大卡）
    </td>
    <td>
     蛋白质含量（克）
    </td>
     <td>
     碳水化合物含量（克）
    </td> 
    <td>
     脂肪含量（克）
    </td>
    <td>
     食物图片
    </td>
   </tr>
   <s:iterator value="foodList" var="food">
  <tr>
  <td><s:property value="id"/></td>
  <td><s:property value="name"/></td>
  <td><s:property value="type1"/></td>
  <td><s:property value="type2"/></td>
  <td><s:property value="price"/></td>
  <td><s:property value="mass"/></td>
  <td><s:property value="calorie"/></td>
  <td><s:property value="protein"/></td>
  <td><s:property value="carbohydra"/></td>
  <td><s:property value="fat"/></td>
  <td><img alt="<s:property value="name"/>" src="img/<s:property value="picture"/>"></td>
  </tr>
  </s:iterator> 
</table>
	
  </body>
</html>
