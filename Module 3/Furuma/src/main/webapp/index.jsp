<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Trang chủ</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css"
          integrity="sha384-b6lVK+yci+bfDmaY1u0zE8YYJt0TZxLEAFyYSLHId4xoVvsrQu3INevFKo+Xir8e" crossorigin="anonymous">
</head>
<body>
<div class="container">
        <div class="text-white">
                <div class="row align-items-center">
                    <div class="col-4">
                        <a href="#" class="navbar-brand text-white">
                            <img src="" alt="Logo" width="100px" height="100px" class="d-inline-block align-text-top">
                        </a>
                    </div>
                    <div class="col-8 text-end">
                        <a href="#" class="btn btn-light me-2">Login</a>
                        <a href="#" class="btn btn-primary">Sign Up</a>
                    </div>
            </div>
        </div>

     <header style="position: fixed">
            <nav class="navbar navbar-expand-lg ">
                <div class="container-fluid">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link mx-4 text-dark" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link mx-4 text-dark" aria-current="page" href="/employee-servlet">Employee</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link mx-4 text-dark" aria-current="page" href="/customer-servlet">Customer</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link mx-4 text-dark" aria-current="page" href="/service-servlet">Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link mx-4 text-dark" aria-current="page" href="/contract-servlet">Contract</a>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </form>
                </div>
            </nav>
    </header >
    <div class="container2" style="margin-top:105px">
        <div class="row">
            <div class="col-3">
                <div id="list-example" class="list-group">
                    <a class="list-group-item list-group-item-action" href="#list-item-1">Item 1</a>
                    <a class="list-group-item list-group-item-action" href="#list-item-2">Item 2</a>
                    <a class="list-group-item list-group-item-action" href="#list-item-3">Item 3</a>
                    <a class="list-group-item list-group-item-action" href="#list-item-4">Item 4</a>
                </div>
            </div>
            <div class="col-9">
                <div data-bs-spy="scroll" data-bs-target="#list-example" data-bs-smooth-scroll="true" class="scrollspy-example" tabindex="0">
                    <h4 id="list-item-1">Item 1</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto commodi culpa deserunt dolor dolorem, ea illum itaque, nam nemo perferendis quam quos sapiente voluptatem. Magni minus nulla quidem quisquam voluptate.</p>
                    <h4 id="list-item-2">Item 2</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet cum eius esse harum pariatur, quo. Aspernatur cum itaque laborum modi officiis quae reprehenderit sint tenetur. Aut dolores id officiis praesentium.</p>
                    <h4 id="list-item-3">Item 3</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fuga ipsam magni neque. At consectetur corporis, cupiditate dolor, excepturi facere fugiat molestiae mollitia nam natus, non officiis placeat sunt veniam voluptate.</p>
                    <h4 id="list-item-4">Item 4</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Assumenda atque culpa cupiditate dolores, doloribus dolorum, excepturi illum, ipsam mollitia nam nostrum quidem tempore vero. Corporis eaque eveniet quis vero voluptatum.</p>
                </div>
            </div>
        </div>
    </div>
    <footer class="bd-footer py-4 py-md-5 mt-5 bg-light">
        <div class="container py-4 py-md-5 px-4 px-md-3">
            <!-- Grid container -->
            <div class="container pt-4">
                <!-- Section: Social media -->
                <section class="mb-4">
                    <!-- Facebook -->
                    <a
                            class="btn btn-link btn-floating btn-lg text-dark m-1"
                            href="#!"
                            role="button"
                            data-mdb-ripple-color="dark"
                    >
                        <i class="fab fa-facebook-f"></i>
                    </a>

                    <!-- Twitter -->
                    <a
                            class="btn btn-link btn-floating btn-lg text-dark m-1"
                            href="#!"
                            role="button"
                            data-mdb-ripple-color="dark"
                    >
                        <i class="fab fa-twitter"></i>
                    </a>

                    <!-- Google -->
                    <a
                            class="btn btn-link btn-floating btn-lg text-dark m-1"
                            href="#!"
                            role="button"
                            data-mdb-ripple-color="dark"
                    >
                        <i class="fab fa-google"></i>
                    </a>

                    <!-- Instagram -->
                    <a
                            class="btn btn-link btn-floating btn-lg text-dark m-1"
                            href="#!"
                            role="button"
                            data-mdb-ripple-color="dark"
                    >
                        <i class="fab fa-instagram"></i>
                    </a>

                    <!-- Linkedin -->
                    <a
                            class="btn btn-link btn-floating btn-lg text-dark m-1"
                            href="#!"
                            role="button"
                            data-mdb-ripple-color="dark"
                    >
                        <i class="fab fa-linkedin"></i>
                    </a>
                    <!-- Github -->
                    <a
                            class="btn btn-link btn-floating btn-lg text-dark m-1"
                            href="#!"
                            role="button"
                            data-mdb-ripple-color="dark"
                    >
                        <i class="fab fa-github"></i>
                    </a>
                </section>
                <!-- Section: Social media -->
            </div>
            <!-- Grid container -->

            <!-- Copyright -->
            <div class="text-center text-dark p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                <!-- Updated year -->
                <span>&copy; 2023 </span>

                <!-- Original copyright -->
                <a class="text-dark" href="https://mdbootstrap.com/">MDBootstrap.com</a>
            </div>
        </div>
    </footer>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
</body>
</html>