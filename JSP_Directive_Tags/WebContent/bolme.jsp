<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="hataSayfasi.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int a = Integer.parseInt(request.getParameter("a"));
	 	int b = Integer.parseInt(request.getParameter("b"));
	 	int sonuc = a / b;
	 	out.println("İŞLEMİN SONUCU : " + sonuc);
	%>
</body>
</html>