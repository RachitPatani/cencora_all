package com.pack.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.requestMapping;
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "home";  // This refers to /WEB-INF/views/home.jsp
    }
}

