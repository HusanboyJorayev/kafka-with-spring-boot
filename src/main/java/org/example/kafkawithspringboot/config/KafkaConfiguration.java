package org.example.kafkawithspringboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.example.kafkawithspringboot.constant.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic newTopic() {
        return TopicBuilder
                .name(Constants.TOPIC)
                .build();
    }
}
