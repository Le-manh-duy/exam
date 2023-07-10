package com.example.my_project_30.controller;

import com.example.my_project_30.entity.employees;
import com.example.my_project_30.model.employessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employees")
public class employeesControllerAPI {
    @Autowired
    employessService employeesService;
    //Create
    @PostMapping("/employees")
    public ResponseEntity createEmployee(@RequestBody employees employee) {
        return ResponseEntity.ok(employeesService.save(employee));
    }

    @GetMapping("/{id}")
    public  ResponseEntity<employees> findById(@PathVariable int id){
        Optional<employees>employees = employeesService.findById(id);
        if (!employees.isPresent()){

            ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(employees.get());
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<employees> deleteById(@PathVariable int id){
        Optional<employees>employees = employeesService.findById(id);
        if (!employees.isPresent()){
            ResponseEntity.badRequest().build();
        }
        employeesService.deleteId(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<employees>>findAll(){
        return  ResponseEntity.ok(employeesService.getAllEmployees());
    }
}
