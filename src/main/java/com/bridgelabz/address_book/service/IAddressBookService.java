package com.bridgelabz.address_book.service;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.model.Contact;

import java.util.List;

public interface IAddressBookService {
    List<Contact> getAllContacts();

    Contact getContactById(long contactId, AddressBookDTO addressBookDTO);

    Contact createContact(AddressBookDTO addressBookDTO);

    Contact updateContactById(long contactId, AddressBookDTO addressBookDTO);

    void deleteContactById(long contactId);
}
