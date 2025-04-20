package com.bridgelabz.address_book.model;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public @Data class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String city;
    private String state;
    private String country;
    private String pinCode;

    public Contact() {}

    public Contact(long contactId, AddressBookDTO addressBookDTO) {
        this.contactId = contactId;
        this.firstName = addressBookDTO.getFirstName();
        this.lastName = addressBookDTO.getLastName();
        this.phoneNumber = addressBookDTO.getPhoneNumber();
        this.email = addressBookDTO.getEmail();
        this.city = addressBookDTO.getCity();
        this.state = addressBookDTO.getState();
        this.country = addressBookDTO.getCountry();
        this.pinCode = addressBookDTO.getPinCode();
    }
}