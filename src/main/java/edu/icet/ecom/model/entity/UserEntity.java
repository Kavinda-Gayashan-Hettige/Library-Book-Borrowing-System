package edu.icet.ecom.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class UserEntity {
    @Id
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String address;
    private LocalDate membershipDate;

}
