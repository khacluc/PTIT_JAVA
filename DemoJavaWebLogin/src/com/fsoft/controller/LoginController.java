package com.fsoft.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.dao.UserDao;
import com.fsoft.entities.User;

@WebServlet("/login")
public class LoginController extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    User user = new User(username, password);
    UserDao userDao = new UserDao();

    try {
      if (userDao.checkLogin(user)) {
        req.getSession().setAttribute("user", user);
        // req.getRequestDispatcher("/home").forward(req, resp);
        resp.sendRedirect(req.getContextPath() + "/home");
      } else {
        req.setAttribute("error", "Incorrect");
        req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
      }
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
