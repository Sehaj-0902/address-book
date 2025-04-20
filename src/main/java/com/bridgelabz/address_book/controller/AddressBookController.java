package com.bridgelabz.address_book.controller;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.dto.ResponseDTO;
import com.bridgelabz.address_book.model.Contact;
import com.bridgelabz.address_book.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAllContacts() {
        List<Contact> contactsList = addressBookService.getAllContacts();
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", contactsList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactById(@PathVariable("contactId") long contactId, @RequestBody AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = addressBookService.getContactById(contactId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful for ID:" + contactId, contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createContact(@RequestBody AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = addressBookService.createContact(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Created Successfully", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactById(@PathVariable("contactId") long contactId, @RequestBody AddressBookDTO addressBookDTO) {
        Contact contact = null;
        contact = addressBookService.updateContactById(contactId, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Successfully", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactById(@PathVariable("contactId") long contactId) {
        addressBookService.deleteContactById(contactId);
        ResponseDTO responseDTO = new ResponseDTO("Contact Deleted successfully", "Deleted Id:" + contactId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}