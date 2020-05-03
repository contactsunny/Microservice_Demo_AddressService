package com.contactsunny.poc.address_service_example.controller;

import com.contactsunny.poc.address_service_example.dtos.Address;
import com.contactsunny.poc.address_service_example.serivces.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/address", produces = "application/json")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Address>> getAddressForUser(
            @PathVariable(value = "id") String userId
    ) {
        List<Address> addresses = addressService.getAddressForUser(Integer.parseInt(userId));
        return new ResponseEntity<>(addresses, HttpStatus.OK);
    }
}
