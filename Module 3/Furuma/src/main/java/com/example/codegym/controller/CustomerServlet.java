package com.example.codegym.controller;

import com.example.codegym.model.Customer;
import com.example.codegym.repository.repo_implement.CustomerRepository;
import com.example.codegym.service.service_implement.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer-servlet")
public class CustomerServlet extends HttpServlet {
    CustomerRepository customerRepository = new CustomerRepository();
    CustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "edit":
                break;
//                case "update":
//                    showFormEdit(request, response);
//                    break;
            case "delete":
                break;
            case "demoUpdate":
                break;
            case "view":
                break;

            default:
                showList(request, response);
        }

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    break;
                case "edit":
                    break;
                default:
                    showList(request, response);
            }
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerService.getAll();
        request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listCustomer.jsp");
        requestDispatcher.forward(request,response);
    }
}
