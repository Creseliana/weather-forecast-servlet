<%@ page import="java.util.List" %>
<%@ page import="com.creseliana.weatherforecast.model.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Admin panel - Weather Forecast</title>
</head>
<body>
<header>
    <div style="text-align: center">
        <img src="img/header.png" height="204" alt="weather header">
        <h1>Weather Forecast Admin Panel</h1>
    </div>
</header>
<div style="text-align: center">
    <p><b>Welcome, ${user.username}</b></p>
</div>
<div>
    <table>
        <thead>
        <tr>
            <th>№</th>
            <th>Username</th>
            <th>Role</th>
        </tr>
        </thead>
        <tbody>
        <%
            List<User> userList = (List) request.getAttribute("userList");
            for (int i = 0, j = 1; i < userList.size(); i++, j++) {
                User user = userList.get(i);
        %>
        <tr>
            <td><%=j%>
            </td>
            <td><%=user.getUsername()%>
            </td>
            <td><%=user.getRole().toString()%>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>