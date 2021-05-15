package com.halils.weathertoday.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class WeatherService {

    @Value("${your.api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<String> getWeather (){
        return ResponseEntity.of(Optional.of("ops"));
    }




}
