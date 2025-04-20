package com.bridgelabz.address_book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public @Data class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}