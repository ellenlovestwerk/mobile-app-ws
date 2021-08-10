package com.appsdeveloperblog.app.ws.service;

import com.appsdeveloperblog.app.ws.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUser(String email);
}
