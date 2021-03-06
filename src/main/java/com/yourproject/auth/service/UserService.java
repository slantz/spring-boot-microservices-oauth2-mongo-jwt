package com.yourproject.auth.service;

import com.yourproject.auth.model.mongo.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getById(String id);

    User getByUsername(String username);

    List<GrantedAuthority> getAuthoritiesByUsername(String username);

    User signUp(User user);

    List<User> createAll(List<User> users);

    List<User> updateAll(List<User> users);

    boolean deleteById(String id);
}
