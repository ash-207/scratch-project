package com.example.newapp.controller;

import com.example.newapp.dto.SignupDTO;
import com.example.newapp.model.Users;
import com.example.newapp.repo.UserRepo;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Signup {

    private final UserRepo userRepo;

    public Signup(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostMapping("/signup")
    public String signup(@RequestBody SignupDTO signupDTO) {

        Users user = new Users();
        user.setName(signupDTO.getName());
        user.setEmail(signupDTO.getEmail());
        user.setPassword(signupDTO.getPassword());

        userRepo.save(user);

        return "User registered successfully";
    }
}
