package com.pethouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PetHouseApplication {

    public static void main(String[] args) {
        System.out.println("http://localhost:8080/");
        SpringApplication.run(PetHouseApplication.class, args);
    }

}
