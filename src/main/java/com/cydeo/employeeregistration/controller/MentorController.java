package com.cydeo.employeeregistration.controller;

import com.cydeo.employeeregistration.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm(Model model){

        model.addAttribute("mentor",new Mentor());

        List<String> batchList = Arrays.asList("JD1","JD2","EU1","B10","B21");
        model.addAttribute("batchList",batchList);

        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String submitForm(@Valid @ModelAttribute("mentor") Mentor mentor, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()) {
//
            List<String> batchList = Arrays.asList("JD1","JD2","EU1","B10","B21");
            model.addAttribute("batchList",batchList);

            return "mentor/mentor-register";
        }


        return "mentor/mentor-confirmation";
//        return "redirect:/mentor/register";
    }
}