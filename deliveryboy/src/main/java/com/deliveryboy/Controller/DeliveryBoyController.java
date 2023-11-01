package com.deliveryboy.Controller;

import com.deliveryboy.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/deliveryboy")
public class DeliveryBoyController
{
    @Autowired
    private KafkaService  kafkaService;

    @PostMapping("/update")
    public ResponseEntity<String> updateLocation()
    {
        this.kafkaService.updateLocation("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " " + ")");
        return new ResponseEntity<>("updated",HttpStatus.OK);
    }
}
