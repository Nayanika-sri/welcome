package com.welcomepage.welcome;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Welcome {

    // Mapped to: http://localhost:8080/welcome
    @RequestMapping("/welcome")
    public String welcome() {
        return "You are Welcome";
    }
}
