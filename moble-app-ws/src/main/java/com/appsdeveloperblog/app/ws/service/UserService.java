package com.appsdeveloperblog.app.ws.service;

import com.appsdeveloperblog.app.ws.shared.dto.UserDto;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * UserService
 */
public interface UserService extends UserDetailsService{

  UserDto createUser(UserDto user);
  UserDto getUser(String email);
  UserDto getUserByUserId(String userId);
}