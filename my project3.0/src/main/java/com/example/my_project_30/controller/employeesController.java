package com.example.my_project_30.controller;

import com.example.my_project_30.model.employessService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class employeesController {
    private final employessService employeesService;

    public employeesController(employessService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/employees")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeesService.getAllEmployees());
        return "employees";
    }


}
