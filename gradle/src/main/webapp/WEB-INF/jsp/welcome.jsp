<html>
<head>
<title>My First JSP!!!</title>
</head>
<body>
<%@ page import='com.example.demo.gradle.controller.*'%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%
LoginController obj = new LoginController(); 
String s_result=obj.display();
%>

Welcome to our web-site :- <%= s_result%> .

<br>



Welcome ${usernameValue} through spring security.

<a href="<c:url value="/logout" />">Logout</a>

</body>
</html>