package com.uepb.lufh.avalia.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.uepb.lufh.avalia.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Lufh Inspeção API")
                                .description("API responsável por gerenciar a avaliação de usabilidade a partir do método por inspeção a padrões.")
                                .contact(
                                        new Contact()
                                                .url("https://www.linkedin.com/in/pablo-monteiro-santos/")
                                                .email("paablomt@gmail.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT License")
                                                .url("http://choosealicense.com/licenses/mit/")
                                )
                                .version("1.0.0-oas3")
                )
        ;
    }
}