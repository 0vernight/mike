package com.example.mike.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: 23236
 * @date: 2021/4/3 13:46
 * @description:
 */

@Data
@Component
@ConfigurationProperties(prefix = "userproperty")
public class User {
    private String username;
    private int age;
    private String password;
    private String email;

}
