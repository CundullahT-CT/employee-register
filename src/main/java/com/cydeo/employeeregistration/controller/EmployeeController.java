package com.cydeo.employeeregistration.controller;

import com.cydeo.employeeregistration.bootstrap.DataGenerator;
import com.cydeo.employeeregistration.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/create")
    public String employeeCreate(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("stateList", DataGenerator.getStateList());

        return "employee/employee-create";

    }

    @PostMapping("/list")
    public String employeeList(@Valid @ModelAttribute("employee") Employee employee, Model model, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("stateList", DataGenerator.getStateList());
            return "employee/employee-create";
        }
//
//        DataGenerator.save(employee);
//
//        model.addAttribute("employeeList", DataGenerator.readAll());

        return "employee/employee-list";
    }

}
