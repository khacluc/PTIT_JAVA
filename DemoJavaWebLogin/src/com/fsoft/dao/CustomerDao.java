package com.fsoft.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fsoft.entities.Customer;
import com.fsoft.utils.DatabaseUtils;

public class CustomerDao {

  public List<Customer> findAllCustomer()
      throws ClassNotFoundException, IOException, SQLException {
    Connection connection = DatabaseUtils.getConnection();
    String sql = "SELECT * FROM Customer";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();
    List<Customer> listCustomer = new ArrayList<>();
    while (resultSet.next()) {
      Customer customer = new Customer();
      customer.setId(resultSet.getInt(1));
      customer.setCustomerName(resultSet.getString(2));
      customer.setEmail(resultSet.getString(3));
      customer.setPhone(resultSet.getString(4));
      customer.setFirstName(resultSet.getString(5));
      customer.setLastName(resultSet.getString(6));
      listCustomer.add(customer);
    }
    return listCustomer;
  }

  public Customer findCustomerBydId(int id)
      throws ClassNotFoundException, IOException, SQLException {
    Connection connection = DatabaseUtils.getConnection();
    String sql = "SELECT * FROM Customer WHERE id = ?";

    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setInt(1, id);
    ResultSet resultSet = preparedStatement.executeQuery();
    Customer customer = new Customer();
    if (resultSet.next()) {
      customer.setId(resultSet.getInt(1));
      customer.setCustomerName(resultSet.getString(2));
      customer.setEmail(resultSet.getString(3));
      customer.setPhone(resultSet.getString(4));
      customer.setFirstName(resultSet.getString(5));
      customer.setLastName(resultSet.getString(6));
    }
    return customer;
  }

  public boolean insertCustomer(Customer customer)
      throws ClassNotFoundException, IOException, SQLException {
    Connection connection = DatabaseUtils.getConnection();
    String sql = "INSERT INTO Customer VALUES(?,?,?,?,?)";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, customer.getCustomerName());
    preparedStatement.setString(2, customer.getEmail());
    preparedStatement.setString(3, customer.getPhone());
    preparedStatement.setString(4, customer.getFirstName());
    preparedStatement.setString(5, customer.getLastName());
    int result = preparedStatement.executeUpdate();
    try {
      if (result > 0) {
        return true;
      }
      return false;
    } finally {
      DatabaseUtils.closeConnection(connection);
    }
  }
}
