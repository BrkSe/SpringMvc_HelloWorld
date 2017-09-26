package com.burakkutbay.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerhabaController {

    @RequestMapping("/")
    public String merhaba(Model model) {
        model.addAttribute("mesaj","Merhaba Dünya");
        return "merhaba";
    }
}
