package com.example.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    @Value("${external.service.url}")
    private String Url;


    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
