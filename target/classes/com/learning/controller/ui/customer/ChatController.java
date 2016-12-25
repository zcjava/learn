package com.learning.controller.ui.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by lw on 16-12-16.
 */
@Controller
@RequestMapping("/chat")
public class ChatController {
    @RequestMapping("")
    public String chat() {
        return "customer/chat";
    }
}
