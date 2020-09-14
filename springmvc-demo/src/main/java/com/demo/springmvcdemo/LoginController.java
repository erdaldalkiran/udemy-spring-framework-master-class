package com.demo.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("")
    public String get(){
        return "login";
    }

    @GetMapping("/text")
    @ResponseBody
    public String getText(){
        return "ciko";
    }

    @PostMapping("")
    public String post(
            @RequestParam(required=true) String name,
            @RequestParam(name="password", required=true) String password,
            Model model
    ){
        var isValid = loginService.isValid(name, password);
        if(!isValid) {
            model.addAttribute("errorMessage", "invalid credentials!");
            return "login";
        }

        model.addAllAttributes(Map.of("name", name, "password", password));
        return "welcome";
    }

}
