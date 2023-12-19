<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap CRUD Data Table for Database with Modal Form</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.7/css/dataTables.bootstrap.min.css">
    <link rel="stylesheet" href="/Style/Style.css">
</head>
<body>
<div class="container">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-xs-6">
                        <h2>Product <b>List</b></h2>
                    </div>
                    <div class="col-xs-6">
                        <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i
                                class="material-icons">&#xE147;</i> <span>Add New Product</span></a>
                        <form action="?action=searchName" method="post">
                            <div class="search-box">
                                <i class="material-icons">&#xE8B6;</i>
                                <input type="text" class="form-control" id="searchInput" name="searchInput"
                                       placeholder="Search&hellip;">
                            </div>
                        </form>


                    </div>
                </div>
            </div>
            <table id="tableCustomer" class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Color</th>
                    <th>Category</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="p" varStatus="loop">
                    <tr>
                        <td>${loop.count}</td>
                        <td>${p.name}</td>
                        <td>${p.price}</td>
                        <td>${p.quantity}</td>
                        <td>${p.color}</td>
                        <td>${p.category.nameCategory}</td>
                        <td>
                            <a href="#editEmployeeModal" class="edit" data-toggle="modal">
                                <i class="material-icons"
                                   data-toggle="tooltip"
                                   title="Edit">&#xE254;</i>
                            </a>
                            <a href="#deleteCheckbox" class="delete" onclick="sendInf('${p.name}','${p.id}')"
                               data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <!-- add -->
    <div id="addEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="?action=create" method="post">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Product</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" required class="form-control" name="name">
                        </div>
                        <div class="form-group">
                            <label>Price</label>
                            <input type="text" required class="form-control" name="price">
                        </div>
                        <div class="form-group">
                            <label>Quantity</label>
                            <input type="text" required class="form-control" name="quantity">
                        </div>
                        <div class="form-group">
                            <label>Color</label>
                            <input type="text" required class="form-control" name="color">
                        </div>
                        <div class="form-group">
                            <label>Category</label>
                            <select class="form-select" name="id_category">
                                <c:forEach var="c" items="${categories}">
                                    <option value="${c.idCategory}">${c.nameCategory}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>

<%--update--%>
    <div id="editEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="?action=update" method="post">
                    <div class="modal-header">
                        <h4 class="modal-title">Update Product</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group">
                            <label>Name</label>
                            <input type="text" required class="form-control" name="name">
                        </div>
                        <div class="form-group">
                            <label>Price</label>
                            <input type="text" required pattern="([5-9]\d{2,}|[1-9]\d{3,})\$" title="Giá phải lớn hơn 500$" class="form-control" name="price">
                        </div>
                        <div class="form-group">
                            <label>Quantity</label>
                            <input type="text" required pattern="^[1-9]\d*$" title="Phải là số nguyên dương" class="form-control" name="quantity">
                        </div>
                        <div class="form-group">
                            <label>Color</label>
                            <input type="text" required class="form-control" name="color">
                        </div>
                        <div class="form-group">
                            <label>Category</label>
                            <select class="form-select" name="id_category">
                                <c:forEach var="c" items="${categories}">
                                    <option value="${c.idCategory}">${c.nameCategory}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>

    <!-- Delete Modal HTML -->
    <div id="deleteCheckbox" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="?action=delete" method="post">
                    <input type="hidden" id="ids" name="ids">
                    <div class="modal-header">
                        <h4 class="modal-title">Delete</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">
                        <input type="hidden" name="idDel" id="idDel">
                        Are you sure to remove
                        <span id="nameDel" class="text-danger"></span> ?
                        <p class="text-warning"><small>This action cannot be undone.</small></p>
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-danger" value="Delete">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script src="https://cdn.datatables.net/1.13.7/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.13.7/js/dataTables.bootstrap.min.js"></script>
<script>
    function sendInf(name, id) {
        document.getElementById("nameDel").innerText = name;
        document.getElementById("idDel").value = id;
    }

    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>