package com.example.test.service;

import com.example.test.domain.request.UserRequest;
import com.example.test.domain.response.UserResponse;
import com.example.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserResponse> getAll() {
        return userRepository.findAll().stream().map(UserResponse::new).toList();
    }

    public void save(UserRequest userRequest) {
        userRepository.save(userRequest.toEntity());
    }
}
