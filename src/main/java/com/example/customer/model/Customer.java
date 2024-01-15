package com.example.customer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="customer")
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Customer {
    @Id
    @JsonProperty(value="id")
    @Column(name="id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @JsonProperty(value="username")
    @Column(name="username")
    public String username;
    @JsonProperty(value="email")
    @Column(name="email")
    public String email;
}
