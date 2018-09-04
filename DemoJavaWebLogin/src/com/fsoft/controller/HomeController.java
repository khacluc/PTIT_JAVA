package com.fsoft.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.dao.CustomerDao;
import com.fsoft.dao.UserDao;

@WebServlet("/home")
public class HomeController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    CustomerDao customerDao = new CustomerDao();
    try {
      req.setAttribute("listCustomer", customerDao.findAllCustomer());
      req.getRequestDispatcher("/views/welcome.jsp").forward(req, resp);
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
