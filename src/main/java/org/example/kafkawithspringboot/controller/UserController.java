package org.example.kafkawithspringboot.controller;

import lombok.RequiredArgsConstructor;
import org.example.kafkawithspringboot.service.impl.UserServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user/")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @GetMapping("/send")
    public ResponseEntity<?> send() {
        for (int i = 1; i <= 20; i++) {
            userServiceImpl.send(i + "_i");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok()
                .body("Send message successfully");
    }
}
