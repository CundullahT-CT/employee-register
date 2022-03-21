package com.cydeo.employeeregistration.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Mentor {

    @NotEmpty
    @Size(min = 2)
    public String firstName;

}
