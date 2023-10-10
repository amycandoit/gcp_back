package com.example.test.controller;

import com.example.test.domain.request.UserRequest;
import com.example.test.domain.response.UserResponse;
import com.example.test.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin(origins = "*")
//@CrossOrigin("http://localhost:3000", "http://34.68.17.60:3000")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserResponse> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public void save(@RequestBody UserRequest userRequest) {
        userService.save(userRequest);
    }
}
