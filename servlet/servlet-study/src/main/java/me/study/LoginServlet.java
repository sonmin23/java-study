package me.study;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("id") == null && request.getParameter("pass") == null){
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
            dispatcher.forward(request, response);
        }
        else {
            request.setAttribute("id", request.getParameter("id"));
            request.setAttribute("pass", request.getParameter("pass"));
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/result.jsp");
            dispatcher.forward(request, response);
        }
    }

}
