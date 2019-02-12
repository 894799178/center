package com.fish.center.control;


import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 一条小咸鱼
 */
@Controller
public class MainControl {



    @RequestMapping("/")
    public String index(HttpSession session){
        System.out.println("获取token-->"+session.getAttribute("token"));

        return "index.html";
    }

    @RequestMapping("/commitToken")
    @ResponseBody
    public String commitToken(HttpSession session, @RequestParam String token){
        System.out.println("token-->"+token);
        session.setAttribute("token",token);
        return "200";
    }

    @RequestMapping("/getCurrToken")
    @ResponseBody
    public String getCurrToken(HttpSession session){
        Map<String,String> map = new HashMap<>();
        String token = (String) session.getAttribute("token");
        map.put("token",token);
        return JSON.toJSONString(map);
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("token");
        return "index.html";
    }

}
