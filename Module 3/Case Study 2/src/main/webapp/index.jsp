<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="/Style/main.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css"
          integrity="sha384-b6lVK+yci+bfDmaY1u0zE8YYJt0TZxLEAFyYSLHId4xoVvsrQu3INevFKo+Xir8e" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="top-header">
        <div class="container_head">
            <div class="wrapper_head">
                <div class="logo_item">
                    <a class="logo" href="index.jsp" title="Furuma" >
                        <img class="logo_img" src="./image/logo_furuma.png" alt="logo" >
                    </a>
                </div>
                <div class="right_item">
                    <div class="user_login">
                        <a href="" title="login">
                            <i class="bi bi-person-circle" style="font-size: 35px;color: blue"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <header class="wrapper_menu_bar">
        <div class="container_head_2">
            <div class="wrapper_container_menu">
                <div class="nav-menu">
                    <div class="nav-item">
                        <ul style="display: flex;gap: 52px;list-style-type: none;">
                            <li>
                                <a class="menu_item_a" href="">Home</a>
                            </li>
                            <li>
                                <a  class="menu_item_a" href="">Employee</a>
                            </li>
                            <li>
                                <a class="menu_item_a" href="">Customer</a>
                            </li>
                            <li>
                                <a  class="menu_item_a" href="">Service</a>
                            </li>
                            <li>
                                <a  class="menu_item_a" href="">Contract</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <form action="" method="get" id="search_form">
                    <input type="text" name="query" placeholder="Nhập từ khóa tìm kiếm" required class="input-text">
                    <button type="submit" class="button_a" title="Tìm kiếm">
                        <svg version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 56.966 56.966" style="enable-background:new 0 0 56.966 56.966;" xml:space="preserve">
                            <path d="M55.146,51.887L41.588,37.786c3.486-4.144,5.396-9.358,5.396-14.786c0-12.682-10.318-23-23-23s-23,10.318-23,23
                            s10.318,23,23,23c4.761,0,9.298-1.436,13.177-4.162l13.661,14.208c0.571,0.593,1.339,0.92,2.162,0.92
                            c0.779,0,1.518-0.297,2.079-0.837C56.255,54.982,56.293,53.08,55.146,51.887z M23.984,6c9.374,0,17,7.626,17,17s-7.626,17-17,17
                            s-17-7.626-17-17S14.61,6,23.984,6z"></path>
                            </svg>
                    </button>
                    <label for="chk_search_mobile" class="chk_search_mobile_hide">
                        <svg version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 212.982 212.982" style="enable-background:new 0 0 212.982 212.982;" xml:space="preserve">
                                <g id="Close">
                                    <path style="fill-rule:evenodd;clip-rule:evenodd;" d="M131.804,106.491l75.936-75.936c6.99-6.99,6.99-18.323,0-25.312
                                    c-6.99-6.99-18.322-6.99-25.312,0l-75.937,75.937L30.554,5.242c-6.99-6.99-18.322-6.99-25.312,0c-6.989,6.99-6.989,18.323,0,25.312
                                    l75.937,75.936L5.242,182.427c-6.989,6.99-6.989,18.323,0,25.312c6.99,6.99,18.322,6.99,25.312,0l75.937-75.937l75.937,75.937
                                    c6.989,6.99,18.322,6.99,25.312,0c6.99-6.99,6.99-18.322,0-25.312L131.804,106.491z"></path>
                                </g>
                            </svg>
                    </label>
                </form>
            </div>
        </div>
    </header>
    <div class="left-body">
        <ul>
            <li class="li_dau">
                <a class="link" href="">Item One</a>
            </li>
            <li class="li_dau">
                <a class="link" href="">Item True</a>
            </li>
            <li class="li_dau">
                <a class="link" href="">Item Theree</a>
            </li>
        </ul>
    </div>
</div>
</body>
</html>