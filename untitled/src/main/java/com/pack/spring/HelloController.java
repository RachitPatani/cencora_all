package com.pack.spring;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController
{
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("login") String uname ,@RequestParam("pass") String pass)
    {
        String a="admin";
        String b="admin";
        ModelAndView mv = new ModelAndView();
        if(!uname.equals(a)&&!pass.equals(b))
        {

            mv.setViewName("nologin");
        }
        else
        {


            mv.setViewName("result");
        }


        return  mv;

    }
}

