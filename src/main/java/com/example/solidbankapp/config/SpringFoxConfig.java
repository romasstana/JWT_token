//package com.example.solidbankapp.config;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//
//public class SpringFoxConfig {
//    @Bean
//    public Docket scrumAllyApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(regex("/api.*"))
//                .build()
//                .apiInfo(apiInfo());
//
//    }
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Scrum_ally API")
//                .description("Scrum_ally is a web application designed for project management")
//                .license("MIT License")
//                .licenseUrl("https://opensource.org/licenses/MIT")
//                .build();
//    }
//
//}
