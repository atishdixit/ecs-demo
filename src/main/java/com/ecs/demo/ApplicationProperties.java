package com.ecs.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ApplicationProperties {

    @Value("${server.port}")
    private String serverPort;

    @Value("${aws.region}")
    private String awsRegion;

    @Value("${spring.datasource.url}")
    private String DataBaseUrl;

    @Value("${spring.datasource.username}")
    private String DataBaseUsername;

    @Value("${spring.datasource.password}")
    private String DataBasePassword;
}
