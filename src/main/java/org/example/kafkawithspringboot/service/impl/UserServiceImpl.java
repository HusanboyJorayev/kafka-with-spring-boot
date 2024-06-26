package org.example.kafkawithspringboot.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.kafkawithspringboot.constant.Constants;
import org.example.kafkawithspringboot.dto.UserDto;
import org.example.kafkawithspringboot.service.UserService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void send(String msg) {
        this.kafkaTemplate.send(Constants.TOPIC, msg);
    }
}

