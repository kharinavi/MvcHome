package ru.kharina.study.mvchome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {

    @GetMapping("/home")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            Model model) {

        //System.out.println("Hello " + name + " " + surname);
        model.addAttribute("name",  name);
        return "helloname";
    }
}
