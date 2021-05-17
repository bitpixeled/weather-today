package com.halils.weathertoday.service;

import com.halils.weathertoday.config.AppProperties;
import com.halils.weathertoday.dto.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    private AppProperties appProperties;

    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather (String cityName){
        return restTemplate.getForObject
                ("http://api.openweathermap.org/data/2.5/weather?q="+cityName+"&APPID="+appProperties.getKey(), Weather.class);
    }
}
