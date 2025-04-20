package com.bridgelabz.address_book.dto;

import lombok.Data;
import lombok.ToString;

@Data
public @ToString class AddressBookDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}