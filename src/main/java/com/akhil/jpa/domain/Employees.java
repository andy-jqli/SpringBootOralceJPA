package com.akhil.jpa.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "EMPLOYEES", schema = "HR")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_GENERATOR")
    @SequenceGenerator(name = "ID_GENERATOR", sequenceName = "HR.EMPLOYEES_SEQ")
    @Column(name = "EMPLOYEE_ID")
    private Long employeeId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private LocalDate hireDate;

    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "SALARY")
    private Long salary;

    @Column(name = "COMMISSION_PCT")
    private Double commissionPct;

    @Column(name = "MANAGER_ID")
    private Long managerId;

    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

}
