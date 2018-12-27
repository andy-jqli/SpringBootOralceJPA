package com.akhil.jpa.service;

import com.akhil.jpa.domain.Employees;
import com.akhil.jpa.dto.EmployeeDetailsDto;
import com.akhil.jpa.dto.EmployeeDto;
import com.akhil.jpa.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Service
public class EmployeeServiceImpl implements EmployeesService {


    private final EmployeesRepository employeesRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public List<Employees> getAllEmployees() {
        List<Employees> employees = new ArrayList<>();
        employeesRepository.findAll().forEach(employees::add);
        return employees;
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employees employee = employeesRepository.getByEmployeeId(employeeId);
        EmployeeDetailsDto empDtls = EmployeeDetailsDto.builder()
                .department(employee.getDepartmentId())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .salary(employee.getSalary())
                .build();
        return new EmployeeDto(employee.getEmployeeId(), asList(empDtls));

    }

    @Override
    public List<EmployeeDto> getEmployeeByDepartment(Long departmentId) {
        List<EmployeeDto> empResponse = new ArrayList<>();
        List<Employees> empByDept = employeesRepository.getByDepartmentId(departmentId);
        for (Employees emp : empByDept) {
            EmployeeDetailsDto empDetails = EmployeeDetailsDto
                    .builder()
                    .department(emp.getDepartmentId())
                    .firstName(emp.getFirstName())
                    .lastName(emp.getLastName())
                    .salary(emp.getSalary())
                    .build();
            empResponse.add(new EmployeeDto(emp.getEmployeeId(), asList(empDetails)));
        }
        return empResponse;
    }


}