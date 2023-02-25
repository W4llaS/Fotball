package com.Fotball.Fotball.Config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        String packagesToscan[] = {"com.Fotball.Fotball.Controller"};
        return GroupedOpenApi
                .builder()
                .group("Controller")
                .packagesToScan(packagesToscan)
                .build();
    }

}



