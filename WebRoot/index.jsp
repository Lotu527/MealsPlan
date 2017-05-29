<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<s:form action="searchFood">

<s:label>食物价格：</s:label><input type="text" name="food.price"><br>
<s:submit value="search"></s:submit>
</s:form>
</body>
</html>

