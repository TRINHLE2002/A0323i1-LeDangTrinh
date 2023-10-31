<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Thuê Phòng</title>
    <link rel="stylesheet" href="bootstrap520/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap5.min.css"/>
    <link rel="stylesheet" href="cssFormInput.css">
    <style>
        th {
            text-align: center;
            font-weight: bold;
            font-size: 40px;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <form method="post" action="?action=create">
        <table class="table">
            <thead>
            <tr>
                <th scope="col">Add new product</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>
                    <div class="mb-3">
                        <label for="name" class="form-label">Name:</label>
                        <input type="text" class="form-control" id="name" name="name" required>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="mb-3">
                        <label for="price" class="form-label">Price:</label>
                        <input type="text" class="form-control" id="price" name="price"
                               pattern="([5-9]\d{2,}|[1-9]\d{3,})\$" title="Giá phải lớn hơn 500$">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="mb-3">
                        <label for="quantity" class="form-label">Quantity:</label>
                        <input type="text" class="form-control" id="quantity" name="quantity"
                               pattern="^[1-9]\d*$" title="Phải là số nguyên dương">
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="mb-3">
                        <select name="options" class="form-select" aria-label="Default select example">
                            <option selected >Choose Color:</option>
                            <option value="Black">Black</option>
                            <option value="Red">Red</option>
                            <option value="Green">Green</option>
                            <option value="White">White</option>
                            <option value="Yellow">Yellow</option>
                        </select>

                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="mb-3">
                        <select name="selectedOption" class="form-select" aria-label="Default select example">
                            <option selected >Choose Category</option>
                            <option value="1">Phone</option>
                            <option value="2">Tivi</option>
                            <option value="3">Tủ Lạnh</option>
                            <option value="4">Máy giặt</option>
                        </select>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit" class="btn btn-primary">Tạo Mới</button>
                    <a class="btn btn-secondary" href="?action=">Hủy</a>
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
</body>
</html>