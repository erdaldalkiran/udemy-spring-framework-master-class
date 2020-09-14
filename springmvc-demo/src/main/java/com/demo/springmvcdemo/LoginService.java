package com.demo.springmvcdemo;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public Boolean isValid(String username, String password){
        if(username.equals("asd") && password.equals("asd")){
            return true;
        }

        return  false;
    }
}
