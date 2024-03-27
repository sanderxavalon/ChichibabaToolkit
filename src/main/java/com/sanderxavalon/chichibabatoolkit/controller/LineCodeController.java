package com.sanderxavalon.chichibabatoolkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LineCodeController {

    @RequestMapping(path = "lineCodeIndex")
    public String lineCodeIndex(Model model) {
        model.addAttribute("hello", "This is line code messenger!");
        return "lineCodeIndex";
    }
}
