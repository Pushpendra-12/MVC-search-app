<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Name is ${student.name}</h2>
    <h2>Id is ${student.id}</h2>
    <h2>Date of Birth is ${student.dob}</h2>
    <h2>Cources is ${student.courses}</h2>
    <h2>Gender is ${student.gender}</h2>
    <h2>Type is ${student.type}</h2>
    <hr>
    <h2>Address  Street is ${student.address.street}</h2>
    <h2>Address  city is ${student.address.city}</h2>
    
</body>
</html>