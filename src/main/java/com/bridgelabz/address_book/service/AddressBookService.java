package com.bridgelabz.address_book.service;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    private List<Contact> contactsList = new ArrayList<>();

    public List<Contact> getAllContacts() {
        return contactsList;
    }

    public Contact getContactById(long contactId, AddressBookDTO addressBookDTO) {
        return contactsList.get((int) (contactId-1));
    }

    public Contact createContact(AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = new Contact(contactsList.size()+1, addressBookDTO);
        contactsList.add(contact);
        return contact;
    }

    public Contact updateContactById(long contactId, AddressBookDTO addressBookDTO) {
        Contact contact = this.getContactById(contactId, addressBookDTO);
        contactsList.set((int) contactId-1, contact);
        return contact;
    }

    public void deleteContactById(long contactId) {
        contactsList.remove((int)contactId-1);
    }
}
