package com.example.test.domain.request;

import com.example.test.domain.entity.User;
import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private String description;

    public User toEntity() {
        return User.builder()
                .name(name)
                .description(description)
                .build();
    }
}
