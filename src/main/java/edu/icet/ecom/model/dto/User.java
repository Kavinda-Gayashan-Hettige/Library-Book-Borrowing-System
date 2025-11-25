package edu.icet.ecom.model.dto;

import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class User {
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private LocalDate membershipDate;

}
