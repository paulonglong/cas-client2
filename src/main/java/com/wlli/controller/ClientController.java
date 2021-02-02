package com.wlli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;


/**
 * @author wlli
 *
 */
@Controller
public class ClientController {

    @RequestMapping("/home/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/login/index.do")
    public String showIndex(HttpServletRequest request, HttpServletResponse response) {
        Principal principal = request.getUserPrincipal();
        request.getSession().setAttribute("user", principal.getName());
        return "index";
    }
}

