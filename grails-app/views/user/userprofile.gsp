<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>
</head>
<body>
<label>Name</label>
<p>${user.username}</p>
<br>
<label>Age</label>
<p>${user.age}</p>
<br>
<label>Height</label>
<p>${user.height}</p>
<br>
<label>Description</label>
<p>${user.description}</p>

<button onclick="signout()">Signout</button>
<script>
    function signout() {
        window.location.href = "/controller/logout";
    }
</script>
</body>
</html>