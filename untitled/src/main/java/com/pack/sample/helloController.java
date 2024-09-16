package com.pack.sample;
import com.pack.sample.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class helloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(HttpServletRequest request, HttpServletResponse response)
    {
        return "welcome";
    }
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public ModelAndView person() {
        return new ModelAndView("person", "command",
                new Person());
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("SpringWeb")Person person,
                             ModelMap model) {
        model.addAttribute("name", person.getName());
        model.addAttribute("age", person.getAge());
        model.addAttribute("id", person.getId());
        return "welcome";
    }
}

