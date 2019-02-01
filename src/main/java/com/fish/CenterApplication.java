package com.fish;

import com.fish.center.bean.AutoClickBean;
import com.fish.center.bean.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class CenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CenterApplication.class, args);
    }

   final static  Map<String, List<AutoClickBean>> autoClickBeans = new HashMap<>(5);
    /**
     * 全局的bean
     * @return
     */
    @Bean(name="globalMap")
    public Map<String, UserData> getGlobalMap(){
        return new HashMap<>(5);
    }

    /**
     * 自动化bean
     * @return
     */
    @Bean(name="autoClickBeans")
    public  Map<String, List<AutoClickBean>> getAutoClickBean(){
        return new HashMap<>(5);
    }


}

