package com.elvan.bookStore.service;

import com.elvan.bookStore.model.User;

import java.util.Optional;

public interface IUserService
{
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
