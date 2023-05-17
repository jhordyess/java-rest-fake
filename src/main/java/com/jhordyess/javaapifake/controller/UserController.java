package com.jhordyess.javaapifake.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhordyess.javaapifake.model.User;

import net.datafaker.Faker;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
  @GetMapping("/random")
  User getRandomUser() {
    Faker faker = new Faker();

    User user = User.builder()
        .username(faker.name().username())
        .fullName(faker.name().fullName())
        .phoneNumber(faker.phoneNumber().phoneNumber())
        .birthDate(faker.date().birthday())
        .build();

    return user;
  }
}
