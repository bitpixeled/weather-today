package com.halils.weathertoday.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties
@PropertySource("file:/home/halil/repos/java/properties/api.properties")
public class AppProperties {

    private String key;

}
