<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 05/10/23
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer</title>
</head>
<link rel="stylesheet" href="/Style/style.css">
<body>
<div class="container">
    <h1>Add New Customer</h1>
    <form action="" method="post" >
        <label for="">Name:</label>
        <input type="text" name="customer_name" required><br>

        <label for="">Birthday:</label>
        <input type="date" name="customer_birthday" required><br>

        <label for="">Gender:</label>
        <input type="radio" name="customer_gender" value="true" required> Male
        <input type="radio" name="customer_gender" value="false" required> Female<br>

        <label for="">ID Card:</label>
        <input type="text" name="customer_id_card" required><br>

        <label for="">Phone:</label>
        <input type="text" name="customer_phone" required><br>

        <label for="">Email:</label>
        <input type="email" name="customer_email" required><br>

        <label for="">Type ID:</label>
        <input type="text" name="customer_type_id" required><br>

        <label for="">Address:</label>
        <input type="text" name="customer_address" required><br>

        <input type="submit" value="Add Customer">
    </form>
</div>
</body>
</html>
