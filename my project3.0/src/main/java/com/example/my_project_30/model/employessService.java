package com.example.my_project_30.model;

import com.example.my_project_30.entity.employees;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class employessService {
    //DI: Dependency injection
    //cach 1
    @Autowired
    employeesRepository employeesRepository;

    //private final BookRepository bookRepository1;

    public employees save(employees employees){
        return employeesRepository.save(employees);

    }

    public List<employees> getAllEmployees(){
        return employeesRepository.findAll();
    }
    public void deleteId(int id){
        employeesRepository.deleteById(id);
    }
    public Optional<employees> findById(int id){
        return employeesRepository.findById(id);


    }


}
