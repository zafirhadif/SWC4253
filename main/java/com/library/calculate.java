package com.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class calculate {

    @GetMapping("/calculate")
    public String showcalculatorPage() {
        return "calculate";
    }
}