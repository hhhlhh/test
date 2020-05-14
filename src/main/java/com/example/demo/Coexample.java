package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties("com.tt")
public class Coexample {
    public  String name;
    public int age;
    public List<String> address;

}
