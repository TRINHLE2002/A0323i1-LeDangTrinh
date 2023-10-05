<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 05/10/23
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="Style/style.css">
</head>
<body>
<div class="container">
    <h1>Add New Employee</h1>
    <form action="" method="post" >
        <label for="">Name:</label>
        <input type="text" name="employee_name" required><br>

        <label for="">Birthday:</label>
        <input type="date" name="employee_birthday" required><br>

        <label for="">ID Card:</label>
        <input type="text" name="employee_id_card" required><br>

        <label for="">Phone Number:</label>
        <input type="text" name="employee_phone" required><br>

        <label for="">Email:</label>
        <input type="text" name="employee_email" required><br>


        <label for="">Education Degree ID:</label>
        <input type="text" name="employee_phone" required><br>

        <label for="">Position ID:</label>
        <input type="text" name="employee_type_id" required><br>

        <label for="">Salary:</label>
        <input type="text" name="employee_address" required><br>

        <input type="submit" value="Add Employee">
    </form>
</div>
</body>
</html>
