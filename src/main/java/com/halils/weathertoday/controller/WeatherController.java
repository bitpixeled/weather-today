package com.halils.weathertoday.controller;

import com.halils.weathertoday.dto.Weather;
import com.halils.weathertoday.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(value = "/{cityName}")
    public Weather getWeather (@PathVariable String cityName){
        return weatherService.getWeather(cityName);
    }


}
