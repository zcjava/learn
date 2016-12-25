package com.learning.controller.ui.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by lw on 16-12-21.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("")
    public String home() {
        return "customer/index";
    }
}
