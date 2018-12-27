package com.akhil.jpa.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Long employeeId;
    private List<EmployeeDetailsDto> employeeDetails;

}