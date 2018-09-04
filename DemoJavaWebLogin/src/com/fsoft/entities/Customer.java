package com.fsoft.entities;

public class Customer {
  private int id;
  private String customerName;
  private String email;
  private String phone;
  private String firstName;
  private String lastName;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getCustomerName() {
    return customerName;
  }
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public Customer(String customerName, String email, String phone,
      String firstName, String lastName) {
    super();
    this.customerName = customerName;
    this.email = email;
    this.phone = phone;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public Customer(int id, String customerName, String email, String phone,
      String firstName, String lastName) {
    super();
    this.id = id;
    this.customerName = customerName;
    this.email = email;
    this.phone = phone;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public Customer() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  
  
  
  
  
}
