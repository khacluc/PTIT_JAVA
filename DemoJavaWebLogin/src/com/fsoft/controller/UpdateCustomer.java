package com.fsoft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.dao.CustomerDao;
import com.fsoft.entities.Customer;

@WebServlet("/update-customer")
public class UpdateCustomer extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String id = req.getParameter("id");
    int customerId = Integer.parseInt(id);
    CustomerDao customerDao = new CustomerDao();
    try {
      Customer customer = customerDao.findCustomerBydId(customerId);
      req.setAttribute("customer", customer);
      req.setAttribute("id", customerId);
      req.getSession().setAttribute("id", customerId);
      req.setAttribute("message", "Update success");
      req.getRequestDispatcher("/views/order-list.jsp").forward(req, resp);
//      PrintWriter writer = resp.getWriter();
//      writer.println("Update");
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
