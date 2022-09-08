package com.casandra.example.controller;

import com.casandra.example.entity.CompositeKey;
import com.casandra.example.entity.User;
import com.casandra.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        user.setKey(CompositeKey.builder().userId(UUID.randomUUID().toString()).profileId(UUID.randomUUID().toString()).build());
        return userRepo.save(user);
    }

    @GetMapping("/{id}/{profileId}")
    public User getUser(@PathVariable String id, @PathVariable String profileId) {

        return userRepo.findById(CompositeKey.builder().userId(id).profileId(profileId).build()).orElseThrow();
    }
}
