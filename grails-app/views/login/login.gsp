<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<g:if test="${session.loginFailed}">
    <h2>Login Failed!</h2>
</g:if>
<g:form name="Login" url="[controller: 'login', action: 'login']">
    <label>Username</label>
    <g:textField name="username"/>
    <br>
    <label>Password</label>
    <g:passwordField name="password"/>
    <br>
    <g:actionSubmit value="Submit" action="login"/>
    <a href="/view/signup">Signup</a>
</g:form>
</body>
</html>