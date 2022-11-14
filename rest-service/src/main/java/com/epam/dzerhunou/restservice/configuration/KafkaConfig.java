package com.epam.dzerhunou.restservice.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic inputTopic(){
        return TopicBuilder.name("input_topic")
                .partitions(3)
                .replicas(2)
                .build();
    }

    @Bean
    public NewTopic outputTopic(){
        return TopicBuilder.name("output_topic")
                .partitions(3)
                .replicas(2)
                .build();
    }
}