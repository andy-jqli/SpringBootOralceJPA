package com.akhil.jpa.repository;

import com.akhil.jpa.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

    Employees getByEmployeeId(Long employeeId);

    @Query("select employees from Employees employees where employees.departmentId = :departmentId" )
    List<Employees> getByDepartmentId(@Param("departmentId") Long departmentId);
}
