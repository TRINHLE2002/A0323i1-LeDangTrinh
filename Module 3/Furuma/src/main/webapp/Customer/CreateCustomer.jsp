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
        <label>Name:</label>
        <input type="text" name="customer_name" required><br>

        <label>Birthday:</label>
        <input type="date" name="customer_birthday" required><br>

        <label>Gender:</label>
        <input type="radio" name="customer_gender" value="true" required> Male
        <input type="radio" name="customer_gender" value="false" required> Female<br>

        <label>ID Card:</label>
        <input type="text" name="customer_id_card" required><br>

        <label>Phone:</label>
        <input type="text" name="customer_phone" required><br>

        <label>Email:</label>
        <input type="email" name="customer_email" required><br>

        <label>Type ID:</label>
        <input type="text" name="customer_type_id" required><br>

        <label>Address:</label>
        <input type="text" name="customer_address" required><br>

        <input type="submit" value="Add Customer">
    </form>
</div>
</body>
</html>
