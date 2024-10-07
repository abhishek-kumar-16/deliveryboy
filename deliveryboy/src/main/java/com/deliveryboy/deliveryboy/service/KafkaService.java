package com.deliveryboy.deliveryboy.service;

import com.deliveryboy.deliveryboy.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    public boolean updateLocation(String location){

           this.kafkaTemplate.send(AppConstants.Location_Topic_Name,location);
           return true; // will be sending true if there is no any error/exception
    }
}
