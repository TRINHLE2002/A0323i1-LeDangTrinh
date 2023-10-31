<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 05/10/23
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="Style/style.css">
</head>
<body>
<div class="container">
    <h1>Add New Employee</h1>
    <form action="" method="post" >
        <label>Name:</label>
        <input type="text" name="employee_name" required><br>

        <label>Birthday:</label>
        <input type="date" name="employee_birthday" required><br>

        <label>ID Card:</label>
        <input type="text" name="employee_id_card" required><br>

        <label>Phone Number:</label>
        <input type="text" name="employee_phone" required><br>

        <label>Email:</label>
        <input type="text" name="employee_email" required><br>


        <label>Education Degree ID:</label>
        <input type="text" name="employee_phone" required><br>

        <label>Position ID:</label>
        <input type="text" name="employee_type_id" required><br>

        <label>Salary:</label>
        <input type="text" name="employee_address" required><br>

        <input type="submit" value="Add Employee">
    </form>
</div>
</body>
</html>
