package com.cydeo.employeeregistration.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {

    @NotBlank
    @Size(min = 5)
    private String firstName;

    @NotBlank
    @Size(min = 3)
    private String lastName;

    @NotNull(message = "Please enter a date.")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;

    @NotBlank
    private String address;
    private String address2;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    @Size(min = 5)
    @Pattern(regexp = "^[0-9]+$")
    private String zipCode;

}
