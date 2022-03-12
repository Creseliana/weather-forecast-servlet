<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Log in - Weather Forecast</title>
</head>
<body>
<header>
    <div style="text-align: center">
        <img src="img/header.png" height="204" alt="weather header">
        <h1>Weather Forecast Log In</h1>
    </div>
</header>
<div>
    <form action="login" method="post">
        <label>Username</label>
        <br>
        <label>
            <input name="username" size="20" value=${username}>
        </label>
        <span style="color: red">${usernameErrorMessage}</span>
        <br>
        <label>Password</label>
        <br>
        <label>
            <input type="password" name="password" size="20">
        </label>
        <span style="color: red">${passwordErrorMessage}</span>
        <br><br>
        <button type="submit">Log in</button>
    </form>
</div>
</body>
</html>