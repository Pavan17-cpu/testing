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
    <f:form method="POST" action="/validate" class="login-form" style="width: 300px; padding: 20px; background-color: #fff; border: 1px solid #ccc; border-radius: 5px;">
    
    <label for="name">Name:</label>
    <f:input path="name" id="name" /><br/>
    <br/>
        
        <label for="password">Password:</label>
        <f:input path="password" id="password" type="password" /><br/>
        <br/>
        <label for="captcha">Captcha:</label>
        <img src="data:real/jpg;base64, ${command.realCaptcha}" /><br/>

        <br/>

        <label for="captchaInput">Captcha:</label>
        <f:input path="captcha" id="captchaInput" />
        <f:hidden path="hiddenCaptcha" />
        <br/>
        <br/>

     <center> <input type="submit" value="Login" style="background-color: black; color: white;" /></center> 

    </f:form>
</body>
</html>
