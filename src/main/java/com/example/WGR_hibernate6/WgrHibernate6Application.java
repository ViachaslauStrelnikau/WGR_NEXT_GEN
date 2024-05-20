package com.example.WGR_hibernate6;

import com.example.WGR_hibernate6.service.UsrService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WgrHibernate6Application {
    public static void main(String[] args) {
        SpringApplication.run(WgrHibernate6Application.class, args);
    }


    @Bean
    public ApplicationRunner run(UsrService service) {
        return env -> {
            service.getUsrs();
        };
    }
}
