<!-- ConfirmationMain.java のサーブレットより


    JavaBeansのクラスからゲッターで各値をもらい、表示する。
    ユーザーに確認してもらい、問題なければ登録 (submit)し、
    問題あればまた入力画面へ。


 -->


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="contentConfirmation.RegistrationBean"%>
<%
RegistrationBean registB = (RegistrationBean) request.getAttribute("rb");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力内容確認</title>
</head>
<body>
<h1>入力内容確認</h1><br><br>
<p>
<%=registB.toString() %>
</p><br><br>
<form action="/WebAccountRegistration/CompletionPage"method="Post">
<input type="hidden" name="infomation" value="<%= registB.toString() %>">
<input type="submit" value="上記の内容で登録する"><br><br>
　　　　　
</form>
<a href="RegistrationPage.html">前の登録画面に戻る</a>

</body>
</html>