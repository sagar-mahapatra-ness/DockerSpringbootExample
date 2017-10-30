package com.example.demo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootResources {
	
	@RequestMapping("/")
    public String root() {
        return "Hello To My App !!!";
    }

}
