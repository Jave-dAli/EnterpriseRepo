package com.login;

import com.login.dao.LoginDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class login extends HttpServlet {
     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          String username = req.getParameter("username");
          String password = req.getParameter("password");

          LoginDao dao = new LoginDao();

          if(dao.check(username,password)) {
               HttpSession session = req.getSession();
               session.setAttribute("username", username);
               session.setAttribute("password", password);
               resp.sendRedirect("welcome.jsp");
          }
          else resp.sendRedirect("login.jsp");

     }
}
