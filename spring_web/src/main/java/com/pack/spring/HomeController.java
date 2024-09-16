package com.pack.spring;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController
{
    @RequestMapping("/")
    public String home()
    {
        return "hello";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("login") String uname ,@RequestParam("pass") String pass)
    {
        ModelAndView mv = new ModelAndView();
        if(uname!="admin"&&pass!="admin")
        {

            mv.setViewName("nologin.jsp");
        }
        else {


            ModelAndView mv1 = new ModelAndView();
            mv.setViewName("hello.jsp");
        }


        return  mv;

    }
}

