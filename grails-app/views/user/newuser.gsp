<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New User</title>
</head>
<body>
<g:form name="CreateForm" url="[controller: 'user', action: 'createNewUser']">
    <label>Username</label>
    <g:textField name="username" placeholder="Username"/>
    <br>
    <label>Password</label>
    <g:passwordField name="password" placeholder="Password"/>
    <br>
    <label>Age</label>
    <g:textField name="age" placeholder="Age"/>
    <br>
    <label>Height</label>
    <g:textField name="height" placeholder="Height"/>
    <br>
    <g:actionSubmit value="Submit" action="createNewUser"/>
</g:form>
</body>
</html>