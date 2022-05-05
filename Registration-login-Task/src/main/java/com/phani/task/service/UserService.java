package com.phani.task.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.phani.task.dto.UserDto;
import com.phani.task.model.User;

public interface UserService extends UserDetailsService{
	User save(UserDto registrationDto);
}
