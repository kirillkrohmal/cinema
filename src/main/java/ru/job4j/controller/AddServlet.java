package ru.job4j.controller;

import ru.job4j.UserStorage;
import ru.job4j.model.Halls;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/add.jsp");
        req.setAttribute("list", UserStorage.getInstance().getUserList());
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Halls halls = new Halls(req.getParameter("rows"), req.getParameter( "columns"));
        UserStorage.getInstance().add(halls);
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/view"));
    }
}

