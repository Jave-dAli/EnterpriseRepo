package com.login;

import com.login.dao.LoginDao;
import com.login.dao.SignupDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/signup")
public class signup extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        SignupDao dao = new SignupDao();

        if(dao.registerUser(username,password)){
            resp.sendRedirect("login.jsp");
        }else{
            resp.sendRedirect("signup.jsp?error=Signup Failed");
        }

    }
}
