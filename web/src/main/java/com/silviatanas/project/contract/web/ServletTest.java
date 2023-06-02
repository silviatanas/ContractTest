package com.silviatanas.project.contract.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class ServletTest extends HttpServlet {
    private int hitCounter;

    public void init() {
        hitCounter = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        hitCounter++;
        String name = request.getParameter("name");
        PrintWriter message = response.getWriter();

        if (name == null) {
            message.println("Welcome visitor");
        } else {
            message.println("Welcome " + name);
        }
        message.println("Hit counter: ");
        message.println(hitCounter);
    }
}