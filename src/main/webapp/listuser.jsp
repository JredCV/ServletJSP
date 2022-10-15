<%@ page import="isil.pe.proyjsp.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 51958
  Date: 14/10/2022
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Users List</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
  <div class="container">
    <table class="table">
      <thead>
      <tr>
        <th scope="col">Document</th>
        <th scope="col">E-mail</th>
        <th scope="col">Username</th>
      </tr>
      </thead>
      <tbody>
      <%List<User> userList = (List<User>) request.getAttribute("list"); %>
      <%
        for (User user: userList) {
      %>
      <tr>
        <td><%=user.getDocument()%></td>
        <td><%=user.getMail()%></td>
        <td><%=user.getUsername()%></td>
      </tr>
      <%    }%>
      </tbody>
    </table>
  </div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

</body>
</html>
