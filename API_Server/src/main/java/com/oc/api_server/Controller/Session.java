package com.oc.api_server.Controller;

import com.oc.api_server.VO.OrUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;

@Controller
@RequestMapping("/Session")
public class Session {
    @RequestMapping("/MakeSession")
    @ResponseBody
    public String MakeSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        return session.getId();
    }

    @RequestMapping("/MakeRSA")
    @ResponseBody
    public String MakeRSA(HttpServletRequest request){
        try {
            HttpSession session = request.getSession();
            return session.getId();

        }catch (Exception e){
            return "ERR";
        }
    }
}
