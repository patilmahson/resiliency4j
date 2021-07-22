package com.mahesh.librarymanangement.config;

import com.mahesh.librarymanangement.service.LibrarymanagementServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;


@Configuration
public class LibraryConfig {
    Logger logger = LoggerFactory.getLogger(LibrarymanagementServiceImpl.class);

    private static final String baseUrl = "http://localhost:8083";
    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        UriTemplateHandler uriTemplateHandler = new RootUriTemplateHandler(baseUrl);
        return builder
                .uriTemplateHandler(uriTemplateHandler)
                .build();

    }

}