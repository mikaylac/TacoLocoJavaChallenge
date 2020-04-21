package com.detroitlabs.tacoloco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@EnableAutoConfiguration
public class TacoOrderAppConfiguration {
    public static void main(String[] args) {
        SpringApplication.run(TacoOrderAppConfiguration.class, args);
    }
}
