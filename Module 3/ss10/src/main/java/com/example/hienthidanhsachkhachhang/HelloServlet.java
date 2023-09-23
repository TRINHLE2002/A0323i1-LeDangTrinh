package com.example.hienthidanhsachkhachhang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<customer> customers = new ArrayList<>();
        customers.add(new customer("Nguyen Van A", "20/12/2022", "Đà Nẵng", "https://laptrinhcuocsong.com/images/anh-vui-lap-trinh-vien-1.png"));
        customers.add(new customer("Tran Thi B", "19/12/2023", "Quảng Nam", "https://laptrinhcuocsong.com/images/anh-vui-lap-trinh-vien-1.png"));
        customers.add(new customer("Le Van C", "11/11/2024", "Sài gòn", "https://laptrinhcuocsong.com/images/anh-vui-lap-trinh-vien-1.png"));

        request.setAttribute("customers", customers);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }
    }


    public void destroy() {
    }
}