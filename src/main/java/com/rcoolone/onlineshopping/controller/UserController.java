package com.rcoolone.onlineshopping.controller;

import com.rcoolone.onlineshopping.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    Map<String, User> users = new HashMap<>();

    @Resource
    User defaultUser;

    @PostMapping("/users")
    public String createUser(
            @RequestParam("userName") String name,
            @RequestParam("email") String email,
            Map<String, Object> resultMap) {

        User user = new User(name, email);
        users.put(name, user);
        resultMap.put("a", user);
        return "userPage";
    }


    @GetMapping("/users/{userName}")
    public String getUser(
            @PathVariable("userName") String name,
            Map<String, Object> resultMap) {
        User user = users.getOrDefault(name, defaultUser);
        resultMap.put("a", user);
        return "userPage";
    }

    @PutMapping("/users")
    public User updateUser(
            @RequestParam("userName") String name,
            @RequestParam("email") String email) {

        User user = users.get(name);
        user.setEmail(email);
        users.put(name, user);
        return user;
    }

    @DeleteMapping("/users/{userName}")
    public String deleteUser(
            @PathVariable("userName") String name,
            Map<String, Object> resultMap) {

        User user = users.remove(name);
        resultMap.put("a", user);
        return "userPage";
    }
}
