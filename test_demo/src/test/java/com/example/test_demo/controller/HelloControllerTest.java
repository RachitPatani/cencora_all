package com.example.test_demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController helloController=new HelloController();
        String response= helloController.hello("rasdasd");
        assertEquals("Hello, World",response);
    }
}