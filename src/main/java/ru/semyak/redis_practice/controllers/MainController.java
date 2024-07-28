package ru.semyak.redis_practice.controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.semyak.redis_practice.entites.User;
import ru.semyak.redis_practice.services.UserService;

@RestController
@RequestMapping("/api")
public class MainController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        return new ResponseEntity<>(userService.save(user), HttpStatusCode.valueOf(201));
    }

    @GetMapping
    public ResponseEntity<User> getById(@RequestParam Integer id) {
        User user = userService.getById(id).orElse(null);
        if (user == null)
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        return new ResponseEntity<>(user, HttpStatusCode.valueOf(200));
    }
}
