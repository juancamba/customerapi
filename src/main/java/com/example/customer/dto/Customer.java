package com.example.customer.dto;

import jakarta.persistence.Entity;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Customer {
    public Long id;
    public String username;
    public String email;

}
