package com.example.motelroom.Controller;

import com.example.motelroom.Model.MotelRoom;
import com.example.motelroom.Service.MotelService.MotelService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "")
public class MotelRoomServlet extends HttpServlet {
    MotelService motelService = new MotelService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null || action.equals("")) {
            action = "";
        }
        switch (action) {
            case "list":
                showListPhongTro(request, response);
                break;
            case "create":
                break;
            case "delete":
                break;
            case "deleteAll":
                break;
            case "search":
                break;

            default:
                showListPhongTro(request, response);
                break;
        }
    }

    private void showListPhongTro(HttpServletRequest request, HttpServletResponse response) {
        List<MotelRoom> phongTroList = motelService.findAll();
        request.setAttribute("phongTro", phongTroList);
        try {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            case "update":
//                updateCustomer(request, response);
                break;
            case "delete":
                delete(request, response);
                break;

        }
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idDel"));
        List<MotelRoom> motelRooms = motelService.delete(id);
        request.setAttribute("phongTro", motelRooms);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


