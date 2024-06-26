package org.example.kafkawithspringboot.service;

import org.example.kafkawithspringboot.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    void send(String ms);
}
