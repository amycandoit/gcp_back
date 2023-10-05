package com.example.test.domain.response;

import com.example.test.domain.entity.User;
import lombok.Getter;

@Getter
public class UserResponse {
    private Long id;
    private String name;
    private String description;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.description = user.getDescription();
    }
}
