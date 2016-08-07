package com.d.controller;

import domain.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dufan on 16/7/29.
 */
@Controller
@Async
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        System.out.println("-------------");
        return "index";
    }
//    @Autowired
//    private UserInfoService.Iface userInfoService;

    @RequestMapping(value = "/onSubmit", method = RequestMethod.POST)
    public ModelAndView onSubmit(HttpServletRequest request,
                                 HttpServletResponse response){
        System.out.println("this is onSubmit");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("----:"+username);
        System.out.println("----:" + password);
        Map<String,String> map = new HashMap();

        map.put("userName", username);
        map.put("passWord", password);
        //return map;


//        userInfoService.saveUserInfo(null);
        return new ModelAndView("login",map);
    }


//    @RequestMapping(value = "SubmitText", method = RequestMethod.POST)
//    public Map SubmitText(HttpServletRequest request,
//                          HttpServletResponse response){
//
//        String submitText = request.getParameter("submitText");
//
//        System.out.println("submitText:--------------->"+submitText);
//        Map<String,String> map = new HashMap();
//        map.put("submitText",submitText);
//        return map;
//
//    }

}
