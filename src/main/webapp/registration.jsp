<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Doctor Registration</title>
</head>
<body style="font-family: Arial, sans-serif; background-color: #f0f0f0; margin: 0; padding: 0; display: flex; justify-content: center; align-items: center; height: 100vh;">
    <f:form method="POST" action="/register" class="login-form" style="width: 300px; padding: 20px; background-color: #fff; border: 1px solid #ccc; border-radius: 5px;">
    
    <label for="name">Name:</label>
    <f:input path="name" id="name" /><br/>
    <br/>
        <label for="graduationdetails">Graduation Details:</label>
        <f:input path="graduationdetails" id="graduationdetails" /><br/>
        <br/>

        <label for="age">Age:</label>
        <f:input path="age" id="age" /><br/>
        <br/>
        <label for="gender">Gender:</label>
        <f:input path="gender" id="gender" /><br/>
        <br/>
        <label for="address">Address:</label>
        <f:input path="address" id="address" /><br/>
        <br/>
        <label for="password">Password:</label>
        <f:input path="password" id="password" /><br/>
        <br/>
        <br/>
        <br/>

     <center> <input type="submit" value="Register" style="background-color: black; color: white;" /></center> 

    </f:form>
</body>
</html>
