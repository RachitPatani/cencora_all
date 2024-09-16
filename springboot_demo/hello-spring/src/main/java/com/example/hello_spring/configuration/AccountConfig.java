package com.example.hello_spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.hello_spring")
@EnableAspectJAutoProxy
public class AccountConfig {
}
