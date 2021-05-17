package com.halils.weathertoday.controller;

import com.halils.weathertoday.config.AppProperties;
import com.halils.weathertoday.dto.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping(value = "/")
    public Weather getWeather (){
        return restTemplate.getForObject
                ("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID="+appProperties.getKey(), Weather.class);
    }


}
