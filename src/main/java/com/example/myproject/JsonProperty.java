package com.example.myproject;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:configprops.json")
@ConfigurationProperties
public class JsonProperty {

    private int port;

    private boolean resend;

    private String host;
}
