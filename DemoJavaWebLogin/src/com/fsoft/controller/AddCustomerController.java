package com.fsoft.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fsoft.dao.CustomerDao;
import com.fsoft.entities.Customer;

@WebServlet("/add-customer")
public class AddCustomerController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("/views/order-list.jsp").forward(req, resp);
    
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String customerName = req.getParameter("name");
    String email = req.getParameter("email");
    String phone = req.getParameter("phone");
    String firstName = req.getParameter("firstName");
    String lastName = req.getParameter("lastName");
    
    Customer customer = new Customer(customerName, email, phone, firstName, lastName);
    CustomerDao customerDao = new CustomerDao();
    try {
      customerDao.insertCustomer(customer);
      List<Customer> listCustomer = customerDao.findAllCustomer();
      req.setAttribute("listCustomer", listCustomer);
      req.getRequestDispatcher("/views/welcome.jsp").forward(req, resp);
    } catch (ClassNotFoundException | SQLException e) {
      //TODO
    }
  }
}
