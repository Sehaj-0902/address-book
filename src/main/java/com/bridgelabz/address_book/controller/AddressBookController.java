package com.bridgelabz.address_book.controller;

import com.bridgelabz.address_book.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAllContacts() {
        return new ResponseEntity<String>("Get Call Successful", HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<String> getContactById(@PathVariable("contactId") Long contactId, @RequestBody Contact contact) {
        return new ResponseEntity<String>("Get Call Successful for ID " + contact, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createContact(@RequestBody Contact contact) {
        return new ResponseEntity<String>("Contact Created Successfully " + contact, HttpStatus.OK);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<String> updateContactById(@PathVariable("contactId") Long contactId, @RequestBody Contact contact) {
        return new ResponseEntity<String>("Contact Updated Successfully " + contact, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<String> deleteContactById(@PathVariable("contactId") Long contactId) {
        return new ResponseEntity<String>("Contact Deleted successfully " + contactId, HttpStatus.OK);
    }
}