package com.yoder.stadiums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Gareth Yoder on 5/7/2017.
 */
@SpringBootApplication(scanBasePackages = {"com.yoder.stadiums"})
public class SpringBootWebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

}

