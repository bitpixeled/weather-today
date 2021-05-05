package com.halils.weathertoday.controller;

import com.halils.weathertoday.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(value = "/")
    public ResponseEntity<String> getWeather (){
        return weatherService.getWeather();
    }


}
