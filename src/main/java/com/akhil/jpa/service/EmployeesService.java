package com.akhil.jpa.service;

import com.akhil.jpa.domain.Employees;
import com.akhil.jpa.dto.EmployeeDto;

import java.util.List;

public interface EmployeesService {

    List<Employees> getAllEmployees();

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getEmployeeByDepartment(Long departmentId);
}