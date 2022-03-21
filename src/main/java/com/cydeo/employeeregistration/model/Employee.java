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

    @NotEmpty
    @Size(min = 3)
    public String firstName;

//    @NotBlank(message = "Please enter a valid last name.")
//    @Size(min = 3, message = "Last name must include at least 3 characters.")
//    private String lastName;
//
////    @NotNull(message = "Please enter a date.")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    private LocalDate birthday;
//
////    @NotBlank(message = "Please enter an email address.")
////    @Email(message = "Pleas enter a valid email address.")
//    private String email;
//
////    @NotBlank(message = "Please enter a password.")
////    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
//    private String password;
//
////    @NotBlank(message = "Please enter an address.")
//    private String address;
//    private String address2;
//
////    @NotBlank(message = "Please enter a city.")
//    private String city;
//
////    @NotBlank(message = "Please select a state.")
//    private String state;
//
////    @NotBlank(message = "Please enter a zip code.")
////    @Size(min = 5, message = "Zip code must include at least 5 digits.")
////    @Pattern(regexp = "^[0-9]+$")
//    private String zipCode;

}
