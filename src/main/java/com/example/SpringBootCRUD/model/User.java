package com.example.SpringBootCRUD.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Pattern(
            regexp = "^[a-zA-Z]+$",
            message = "First name must contain only letters")
    @Column(name = "first_name", nullable = false)
    @NotBlank(message = "First name is required")
    private String firstName;

    @Pattern(
            regexp = "^[a-zA-Z]+$",
            message = "Last name must contain only letters")


    @Column(name = "last_name", nullable = false)
    @NotBlank(message = "Last name is required")
    private String lastName;


    @Column(name = "email", nullable = false)
    @NotBlank(message = "Email is required")
    @Email(message = "Please enter a valid email address")
    private String email;

    public User() {
    }


    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

