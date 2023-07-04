package com.rcoolone.onlineshopping.config;

import com.rcoolone.onlineshopping.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User getUser() {
        return User.builder().name("Nobody").email("Nobody@gamil.com").build();
    }
}
