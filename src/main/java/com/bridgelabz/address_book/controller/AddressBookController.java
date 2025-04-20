package com.bridgelabz.address_book.controller;

import com.bridgelabz.address_book.dto.AddressBookDTO;
import com.bridgelabz.address_book.dto.ResponseDTO;
import com.bridgelabz.address_book.model.Contact;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAllContacts() {
        Contact contact = new Contact(1, new AddressBookDTO());
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{contactId}")
    public ResponseEntity<ResponseDTO> getContactById(@PathVariable("contactId") long contactId, @RequestBody AddressBookDTO addressBookDTO) {
        Contact contact = new Contact(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Successful for ID:" + contactId, contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createContact(@RequestBody AddressBookDTO addressBookDTO) {
        Contact contact = new Contact(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Created Successfully", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{contactId}")
    public ResponseEntity<ResponseDTO> updateContactById(@PathVariable("contactId") long contactId, @RequestBody AddressBookDTO addressBookDTO) {
        Contact contact = new Contact(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Contact Updated Successfully", contact);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{contactId}")
    public ResponseEntity<ResponseDTO> deleteContactById(@PathVariable("contactId") long contactId) {
        ResponseDTO responseDTO = new ResponseDTO("Contact Deleted successfully", "Deleted Id:" + contactId);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}