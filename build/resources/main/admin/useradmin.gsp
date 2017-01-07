<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin Services</title>
    <asset:javascript src="application.js"/>
    <style>
    body {
        text-align: center;
    }

    table {
        border: 3px solid black;
        border-collapse: collapse;
        margin-bottom: 10px;
        table-layout: fixed;
        width: 100%;
    }

    td, th {
        border: 2px solid black;
        text-align: center;
        font-size: 15pt;
    }

    td:hover {
        background-color: darkblue;
        color: white;
    }

    td {
        transition: 0.5s background-color;
    }

    tr:nth-child(odd) {
        background-color: greenyellow;
    }

    tr:nth-child(even) {
        background-color: coral;
    }

    .button {
        color: white;

        font-weight: bold;

        height: 50px;
        width: 75px;

        margin: 10px 25px;
    }

    .update {
        background-color: green;
    }

    .delete {
        background-color: red;
    }

    .create {
        background-color: purple;
        font-weight: bold;
        color: whitesmoke;
        height: 35px;
        width: 50%;
    }
    </style>
</head>

<body>

%{--<ul>--}%
%{--<g:each in="${users}"><!--"for/each" loop; *. shows username within array -- makes list of item after *.-->--}%
%{--<li>--}%
%{--${it.username} <!--"it" represents each individual iteration; ".username" shows only username within array-->--}%
%{--</li>--}%
%{--</g:each>--}%
%{--</ul>--}%

<h1>Hello ${session.username}</h1>

<table>
    <tr>
        <th>Action</th>
        <th>ID</th>
        <th>Username</th>
        <th>Age</th>
        <th>Height</th>
    </tr>
    <g:each in="${users}">
        <tr>
            <td>
                <button class="update button" onclick="update(${it.id})">Update</button>
                <button class="delete button" onclick="deleteByID(${it.id})">Delete</button>
            </td>
            <td>
                ${it.id}
            </td>
            <td>
                ${it.username}
            </td>
            <td>
                ${it.age}
            </td>
            <td>
                ${it.height}
            </td>
        </tr>
    </g:each>
</table>

<button class="create" onclick="create()">Create</button>
<button onclick="signout()">Signout</button>

<asset:javascript src="useradmin.js"/>

</body>
</html>