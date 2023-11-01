package com.deliveryboy.Service;

import com.deliveryboy.Utils.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService
{
    @Autowired
    KafkaTemplate<String ,String> kafkaTemplate;

    public boolean updateLocation(String location)
    {
        kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        return true;
    }
}
