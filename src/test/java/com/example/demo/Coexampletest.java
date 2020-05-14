package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Coexampletest {
@Autowired
    private  Coexample coexample;
@Test
    public  void getName(){
    System.out.println(coexample.getName());
    }
    @Test
    public  void get_age(){
    System.out.println(coexample.getAge());
    }
    @Test
    public void getAddresses(){
    System.out.println(coexample.getAddress());
    }
}
