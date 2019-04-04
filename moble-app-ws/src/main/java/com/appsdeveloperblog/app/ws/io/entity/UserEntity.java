package com.appsdeveloperblog.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * UserEntity
 */
@Entity(name="users")
public class UserEntity implements Serializable{

  private static final long serialVersionUID = 476034567867345501L;
  
  @Id
  @GeneratedValue
  private long id;

  @Column(nullable = false)
  private String userId;
  @Column(nullable = false, length = 50)
  private String firstName;
  @Column(nullable = false, length = 50)
  private String lastName;
  @Column(nullable = false, length = 120, unique = true)
  private String email;
  @Column(nullable = false)
  private String encriptedPassword;
  private String emailVerificationToken;
  @Column(nullable = false)
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