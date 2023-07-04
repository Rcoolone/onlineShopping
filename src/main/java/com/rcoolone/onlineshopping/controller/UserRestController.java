package com.rcoolone.onlineshopping.controller;

import com.rcoolone.onlineshopping.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {
    Map<String, User> users = new HashMap<>();

    @PostMapping("/usersRest")
    public User createUser(
            @RequestParam("userName") String name,
            @RequestParam("email") String email) {

        User user = new User(name, email);
        users.put(name, user);

        return user;
    }

    @GetMapping("/usersRest")
    public List<User> listUsers() {
        List<User> result = new ArrayList<>(users.values());
        return result;
    }

    @GetMapping("/usersRest/{userName}")
    public User getUser(
            @PathVariable("userName") String name) {

        return users.get(name);
    }

    @PutMapping("/usersRest")
    public User updateUser(
            @RequestParam("userName") String name,
            @RequestParam("email") String email) {

        User user = users.get(name);
        user.setEmail(email);
        users.put(name, user);
        return user;
    }

    @DeleteMapping("/usersRest/{userName}")
    public User deleteUser(
            @PathVariable("userName") String name) {

        User user = users.remove(name);
        return user;
    }
}
