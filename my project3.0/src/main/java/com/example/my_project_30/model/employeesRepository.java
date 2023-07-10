package com.example.my_project_30.model;

import com.example.my_project_30.entity.employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface employeesRepository extends JpaRepository<employees,Integer> {
}
