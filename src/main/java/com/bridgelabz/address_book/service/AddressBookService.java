package com.bridgelabz.address_book.service;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    public List<Contact> getAllContacts() {
        List<Contact> contactsList = new ArrayList<>();
        contactsList.add(new Contact(1, new AddressBookDTO()));
        return contactsList;
    }

    public Contact getContactById(long contactId, AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = new Contact(1, addressBookDTO);
        return contact;
    }

    public Contact createContact(AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = new Contact(1, addressBookDTO);
        return contact;
    }

    public Contact updateContactById(long contactId, AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = new Contact(1, addressBookDTO);
        return contact;
    }

    public void deleteContactById(long contactId) {}
}
