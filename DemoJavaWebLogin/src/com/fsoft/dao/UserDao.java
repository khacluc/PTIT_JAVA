package com.fsoft.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fsoft.entities.User;
import com.fsoft.utils.DatabaseUtils;


public class UserDao {
  public boolean checkLogin(User user)
      throws ClassNotFoundException, IOException, SQLException {
    Connection connection = DatabaseUtils.getConnection();
    String sql = "SELECT * FROM Users WHERE user_names = ? AND passwords = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, user.getUsername());
    preparedStatement.setString(2, user.getPassword());
    ResultSet resultSet = preparedStatement.executeQuery();
    try {
      if (resultSet.next()) {
        return true;
      }
      return false;
    } finally {
      DatabaseUtils.closeConnection(connection);
    }
  }

  public List<User> findAllUser()
      throws ClassNotFoundException, IOException, SQLException {
    Connection connection = DatabaseUtils.getConnection();
    String sql = "SELECT * FROM Users";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    ResultSet resultSet = preparedStatement.executeQuery();
    List<User> listUser = new ArrayList<>();
    while (resultSet.next()) {
      User user = new User();
      user.setUsername(resultSet.getString(2));
      user.setPassword(resultSet.getString(3));
      listUser.add(user);
    }
    return listUser;
  }
}
