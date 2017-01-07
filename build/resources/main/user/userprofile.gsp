<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Profile</title>

    <script>
        function signout() {
            window.location.href = "/controller/logout";
        }
    </script>
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

<a href="/view/update?id=${user.id}">Update</a>
</body>
</html>