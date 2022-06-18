package com.example.customerdemo.service;

import com.example.customerdemo.model.User;
import com.example.customerdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public User getById(Long id) {
        log.info("IN UserService getById {} " + id);
        return userRepository.getById(id);
    }


    public void save(User user) {
        log.info("IN UserService save {} " + user);
        userRepository.save(user);
    }


    public void delete(Long id) {
        log.info("IN UserService delete {} " + id);
        userRepository.deleteById(id);
    }


    public List<User> getAll() {
        log.info("IN UserService getAll {} ");
        return userRepository.findAll();
    }
}
