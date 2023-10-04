<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 02/10/23
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product-servlet?action=view" method="post">
    <table border="1">
        <tr>
            <td>ID</td>
            <td width="100px"><input type="text" name="code" readonly value="${product.code}"></td>
        </tr>
        <tr>
            <td>Tên</td>
            <td width="100px"><input type="text" name="name" readonly value="${product.name}"></td>
        </tr>
        <tr>
            <td>Số lượng</td>
            <td width="100px"><input type="text" name="quantity" readonly value="${product.quantity}"></td>
        </tr>
        <tr>
            <td>Xuất xứ</td>
            <td width="100px"><input type="text" name="madeIn" readonly value="${product.madeIn}"></td>
        </tr>
    </table>
</form>
</body>
</html>
