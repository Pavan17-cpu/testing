<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>List</title>
</head>
<body>
    <table border="1px">
        <tr>
          <th>Name</th>  
          <th>Age</th>
          <th>Gender</th>
          <th>HealthIssue</th>
          <th>Address</th>
          <th>Edit</th>
          <th>Delete</th>
        </tr>
        <%@ page import="com.p1.klu.Patient"  %>
        <%@ page import="java.util.*"  %>

    <% for(Patient u: (List<Patient>)request.getAttribute("ul")){  %>
      <tr>
        <td><%= u.getName() %></td>
        <td><%= u.getAge() %></td>
        <td><%= u.getGender() %></td>
        <td><%= u.getHealthissue() %></td>
        <td><%= u.getAddress() %></td>
        <td><a href="/updatepatient">Update Patient</a></td>
        <td><a href="/delete">Delete Patient</a></td>

      
        
      </tr>


   <% } %>
    </table>
    <a href="/add">Add New Patient</a>

</body>
</html>
