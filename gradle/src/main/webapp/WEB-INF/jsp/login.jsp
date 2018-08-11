<html>
<head>
<title>My First JSP!!!</title>
</head>
<body>


<!-- Welcome ${namegetValue} -- EL to display variable defined in java -->

<font color="red">${errorMessage}</font>
<!-- <form>  As a method="get" in URL http://localhost:9081/mainstay/login?username=sh59811&password=123456, data is send in request header -->
<form method="post"> <!-- Secure way & recommanded as a method="post" in URL http://localhost:9081/mainstay/login , data is send as a body of request-->
User-name: <input type="text" name="username" placeholder="Non case-sensitive"/>
<br>
Pass-word: <input type="password" name="password" placeholder="case-sensitive"/>
<br>
<input type="submit" value="Submit Now"/>
</form>


</body>
</html>