package com.example.pagination.PaginationImplementation.controller;

import com.example.pagination.PaginationImplementation.entity.User;
import com.example.pagination.PaginationImplementation.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userRepo.save(user);
    }

    @GetMapping
    public List<User> getAll(){
        return userRepo.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id){
        return userRepo.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        return userRepo.deleteProduct(id);
    }
}
