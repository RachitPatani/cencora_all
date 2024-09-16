package code.beginner.sample.config;

import code.beginner.sample.modl.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    public Student GetStudent()
    {
        return new Student(2,"rach","abc");
    }

}

