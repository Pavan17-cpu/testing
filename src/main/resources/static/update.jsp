<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Patient</title>
</head>
<body>
    <h2>Update Patient</h2>
    <form method="post" action="/update">
       
        <label for="name">Name:</label>
        <input type="text" name="name" value="${p.name}" /><br/><br/>
        
        <label for="age">Age:</label>
        <input type="text" name="age" value="${p.age}" /><br/><br/>
        
        <label for="gender">Gender:</label>
        <input type="text" name="gender" value="${p.gender}" /><br/><br/>
        
        <label for="healthissue">Health Issue:</label>
        <input type="text" name="healthissue" value="${p.healthissue}" /><br/><br/>
        
        <label for="address">Address:</label>
        <input type="text" name="address" value="${p.address}" /><br/><br/>
        
        <input type="submit" value="Update" />
    </form>
</body>
</html>
