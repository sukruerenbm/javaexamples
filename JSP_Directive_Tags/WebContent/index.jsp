<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="tarih.jsp" %>
	<form action="bolme.jsp" method="post">
			<table>
				<tr>
					<td><c:out value="a:"/></td>
					<td><input type="text" name="a"/></td>
				</tr>
				<tr>
					<td><c:out value="b:"/></td>
					<td><input type="text" name="b"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Böl" style="width:100%;"/></td>
				</tr>
			</table>
		</form>
</body>
</html>