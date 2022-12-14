<%--
  Created by IntelliJ IDEA.
  User: 51958
  Date: 14/10/2022
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Register Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<div class="container">

    <nav class="navbar bg-light">
        <div class="container">
            <a class="navbar-brand" href="#">
                <img src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="Bootstrap" width="30" height="24">
            </a>
            <p>Register Customer</p>
        </div>
    </nav>

    <form action="<%=request.getContextPath()%>/UserServlet" method="post">
        <div class="mb-3">
            <label for="nomCli" class="form-label">Nombre</label>
            <input type="text" class="form-control" id="nomCli" name="nomCli" >
        </div>
        <div class="mb-3">
            <label for="apeCli" class="form-label">Apellido</label>
            <input type="text" class="form-control" id="apeCli" name="apeCli">
        </div>
        <div class="mb-3">
            <label for="dni" class="form-label">Dni</label>
            <input type="text" class="form-control" id="dni" name="dni">
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
            <button type="submit" class="btn btn-primary mb-3">Add Customer</button>
        </div>
    </form>
</div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
