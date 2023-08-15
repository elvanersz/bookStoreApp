package com.elvan.bookStore.service;

import com.elvan.bookStore.repository.IUserRepository;
import com.elvan.bookStore.model.Role;
import com.elvan.bookStore.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class UserService implements IUserService
{
    @Autowired
    private IUserRepository userRepository;


    @Override
    public User saveUser(User user)
    {
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional
    public void makeAdmin(String username)
    {
        userRepository.updateUserRole(username, Role.ADMIN);
    }
}
