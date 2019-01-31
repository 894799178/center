package com.fish;

import com.fish.center.bean.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class CenterApplication {

    public static void main(String[] args) {

        SpringApplication.run(CenterApplication.class, args);
    }

    @Bean(name="GlobalMap")
    public Map<String, UserData> getGlobalMap(){
        return new HashMap<>(5);
    }

}

