<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete User</title>
</head>
<body>
    <h1>Delete User</h1>
    <form action="/deleteUser" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <input type="submit" value="Delete User">
    </form>
</body>
</html>
