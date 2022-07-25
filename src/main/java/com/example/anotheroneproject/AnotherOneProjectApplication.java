package com.example.anotheroneproject;

import com.example.anotheroneproject.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class AnotherOneProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnotherOneProjectApplication.class, args);
    }

}
