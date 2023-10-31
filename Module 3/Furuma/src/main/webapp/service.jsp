<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 05/10/23
  Time: 3:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Service</title>
    <link rel="stylesheet" href="Style/style.css">
</head>
<body>
<div class="container">
<h1>Add New Service</h1>
    <form action="" method="post">
            <label>Service Name:</label>
            <input type="text" id="serviceName" name="serviceName" required>

            <label>Service Area:</label>
            <input  type="number" step="0.01" id="serviceArea" name="serviceArea" required>

            <label>Service Cost:</label>
            <input  type="number" step="0.01" id="serviceCost" name="serviceCost" required>

            <label>Maximum People:</label>
            <input type="number" id="serviceMaxPeople" name="serviceMaxPeople" required>

            <label>Rent Type:</label>
            <select  id="rentTypeId" name="rentTypeId" required>
                <%-- Loop through the rent type list and generate options --%>

            </select>
            <input  type="submit" value="Add Service">
    </form>
</div>
</body>
</html>