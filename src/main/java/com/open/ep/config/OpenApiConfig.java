package com.open.ep.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean(name = "EPOpenApi")
    public OpenAPI EPOpenApi() {
        // Available at
        // http://localhost:8080/blogging-api-docs-ui.html
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("Application API")
                        .description(
                                "API implemented with Spring Boot RESTful service and documented using springdoc-openapi and OpenAPI 3."));
    }
}