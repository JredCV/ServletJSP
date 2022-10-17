<%--
  Created by IntelliJ IDEA.
  User: 51958
  Date: 16/10/2022
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>

    <h1>Ingrese el DNI </h1>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

</head>
<body>
<nav class="navbar bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="Bootstrap" width="30" height="24">
        </a>
        <p>Update User</p>
    </div>
</nav>

<div class="container">
    <form action="<%=request.getContextPath()%>/UpdateUserServlet" method="post">
        <div class="mb-3">
            <label for="dni" class="form-label">Dni</label>
            <input type="text" class="form-control" id="dni" name="dni">
        </div>
        <div class="mb-3">
            <label for="nomCli" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="nomCli" name="nomCli" >
        </div>
        <div class="mb-3">
            <label for="apeCli" class="form-label">Apellido</label>
            <input type="text" class="form-control" id="apeCli" name="apeCli">
        </div>

        <div class="mb-3">
            <label for="email" class="form-label">E-mail</label>
            <input type="email" class="form-control" id="email" name="email">
        </div>
        <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="username" name="username" >
        </div>
        <div class="mb-3">
            <label for="pass" class="form-label">Password</label>
            <input type="password" class="form-control" id="pass" name="pass" >
        </div>
        <div class="col-auto">
            <button type="submit" class="btn btn-primary mb-3">Update Customer</button>
        </div>

    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>

</body>
</html>
