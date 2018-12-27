package com.akhil.jpa.dto;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDetailsDto {

    private String firstName;
    private String lastName;
    private Long department;
    private Long salary;
}
