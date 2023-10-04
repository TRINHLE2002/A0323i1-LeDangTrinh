<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 02/10/23
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>create</title>
</head>
<body>
    <a href="/product-servlet?action=create">Back to list</a>
    <h1>Create new product</h1>
    <form action="/product-servlet" method="post">
        <table>

            <tr>
                <td>Product Name</td>
                <td><input type="text" name="name"></td>
            </tr>

            <tr>
                <td>Price</td>
                <td><input type="text" name="price"></td>
            </tr>

            <tr>
                <td>Description</td>
                <td><input type="text" name="description"></td>
            </tr>

            <tr style="collapse: 2">
                <input type="submit" value="add">
            </tr>
        </table>
        <input type="hidden" name="action" value="create">
    </form>
</body>
</html>
