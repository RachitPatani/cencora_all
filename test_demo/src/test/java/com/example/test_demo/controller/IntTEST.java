package com.example.test_demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class IntTEST {

    @Autowired
    private MockMvc mvc;

//    @Test
//    void hello() throws Exception
//    {
//        RequestBuilder request=get("/hello");
//        MvcResult result=mvc.perform(request).andReturn();
//        assertEquals("Hello, World",result.getResponse().getContentAsString());
//
//
//    }
    @Test
    public  void testHelloWithNAme() throws Exception
    {
        mvc.perform(get("/hello?name=Krishna"))
                .andExpect(content().string("Hello, Krishna"));
    }
}