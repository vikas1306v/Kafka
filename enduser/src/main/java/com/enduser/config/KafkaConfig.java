package com.enduser.config;

import com.enduser.Utils.AppConstants;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig
{
    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME,groupId =AppConstants.GROUP_ID)
    public void consumer(String message)
    {
        System.out.println(message);
    }
}
