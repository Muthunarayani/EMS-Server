package com.harini.ems_backend.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor



@Entity
@Table(name="EMPLOYEES")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name="email_id",nullable=false,unique = true)
    private String email;


}

