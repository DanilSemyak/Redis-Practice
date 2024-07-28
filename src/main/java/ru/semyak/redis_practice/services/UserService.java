package ru.semyak.redis_practice.services;


import org.springframework.stereotype.Service;
import ru.semyak.redis_practice.entites.User;
import ru.semyak.redis_practice.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getById(Integer id) {
        return userRepository.findById(id);
    }

}

