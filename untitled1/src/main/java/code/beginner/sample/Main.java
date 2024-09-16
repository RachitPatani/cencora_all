package code.beginner.sample;

import code.beginner.sample.config.StudentConfig;
import code.beginner.sample.modl.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var cfg= StudentConfig.class;
        try(var context=new AnnotationConfigApplicationContext(cfg))
        {
            var studentobj=context.getBean("GetStudent", Student.class);
            System.out.println(studentobj);
        }
    }
}
