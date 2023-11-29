package com.red.red.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PublicController {
    
    @PostMapping(value = "publication")
    public String publication() {

        return "publication from secure endpoint ";
    }
}
