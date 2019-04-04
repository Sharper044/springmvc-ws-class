package com.appsdeveloperblog.app.ws.shared.dto;

import java.io.Serializable;

/**
 * userDto
 */
public class UserDto implements Serializable {

  private static final long serialVersionUID = 464646769461343763L;
  private long id;
  private String userId;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private String encriptedPassword;
  private String emailVerificationToken;
  private Boolean emailVerificationStatus = false;

  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public String getEmail() {
    return email;
  }
  public String getUserId() {
    return userId;
  }
  public Long getId() {
    return id;
  }
  public String getPassword() {
    return password;
  }
  public String getEncriptedPassword() {
    return encriptedPassword;
  }
  public String getEmailVerificationToken() {
    return emailVerificationToken;
  }
  public Boolean getEmailVerificationStatus() {
    return emailVerificationStatus;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public void setEncriptedPassword(String encriptedPassword) {
    this.encriptedPassword = encriptedPassword;
  }
  public void setEmailVerificationToken(String emailVerificationToken) {
    this.emailVerificationToken = emailVerificationToken;
  }
  public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
    this.emailVerificationStatus = emailVerificationStatus;
  }
}