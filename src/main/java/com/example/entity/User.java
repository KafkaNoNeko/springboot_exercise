package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")

public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(name = "first_name", nullable = false) // Using snake_case for database convention
  private String firstname;

  @Column(name = "last_name", nullable = false)
  private String lastname;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(name = "phone_number", nullable = false)
  private String phonenumber;

  // Getters
  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getEmail() {
    return email;
  }

  public String getPhonenumber() {
    return phonenumber;
  }

  // Setters
  public void setId(Long id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
  }

}
