<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<s:form action="searchFood">
<s:label>食物价格：</s:label><input type="text" name="food.price"><br>
<s:submit value="查找食物"></s:submit>
</s:form>

<s:form action="getPlan">
<s:label>规划资金：</s:label><input type="text" name="plan.price"><br>
<s:label>规划周期：</s:label><select name="plan.type">
								<option value="1">日</option>
								<option value="2">周</option>
								<option value="3">月</option>
							</select><br>
<s:label>规划时间：</s:label><input type="text" name="plan.time"><br>
<s:submit value="获取计划"></s:submit>
</s:form>

<s:form action="userLogin">
<s:label>用户名称：</s:label><input type="text" name="user.name"><br>
<s:label>用户密码：</s:label><input type="password" name="user.password"><br>
<s:submit value="用户登录"></s:submit>
</s:form>

<s:form action="userRegister">
<s:label>用户名称：</s:label><input type="text" name="user.name"><br>
<s:label>用户密码：</s:label><input type="password" name="user.password"><br>
<s:label>用户电话：</s:label><input type="text" name="user.phone"><br>
<s:label>用户邮箱：</s:label><input type="text" name="user.email"><br>
<s:submit value="用户注册"></s:submit>
</s:form>
</body>
</html>

