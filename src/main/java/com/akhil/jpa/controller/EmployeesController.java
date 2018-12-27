package com.akhil.jpa.controller;

import com.akhil.jpa.domain.Employees;
import com.akhil.jpa.dto.EmployeeDto;
import com.akhil.jpa.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {

    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping(path = "/employees", produces = "application/json")
    public List<Employees> getAllEmployees() {
        List<Employees> allEmployees = employeesService.getAllEmployees();
        System.out.println("Employees Total: " + allEmployees.size());
        return allEmployees;
    }

    @RequestMapping("/employees/{id}")
    public EmployeeDto getProduct(@PathVariable String id, Model model) {
        return employeesService.getEmployeeById(Long.valueOf(id));
    }

    @GetMapping(path = "/dept/{id}")
    public List<EmployeeDto> getEmployeesByDept(@PathVariable String id){
        return employeesService.getEmployeeByDepartment(Long.valueOf(id));
    }
}

