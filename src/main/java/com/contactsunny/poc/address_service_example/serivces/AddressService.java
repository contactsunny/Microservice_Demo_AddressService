package com.contactsunny.poc.address_service_example.serivces;

import com.contactsunny.poc.address_service_example.dtos.Address;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressService {

    public List<Address> getAddressForUser(int userId) {
        List<Address> addresses = new ArrayList<>();

        Address address1 = new Address();
        address1.setUserId(userId);
        address1.setAddressLine1("Address1-AddressLine1");
        address1.setAddressLine2("Address1-AddressLine2");
        address1.setCity("Bangalore");
        address1.setZipCode("560010");
        address1.setState("Karnataka");
        address1.setCountry("India");

        Address address2 = new Address();
        address2.setUserId(userId);
        address2.setAddressLine1("Address2-AddressLine1");
        address2.setAddressLine2("Address2-AddressLine2");
        address2.setCity("City");
        address2.setZipCode("570011");
        address2.setState("Karnataka");
        address2.setCountry("India");

        addresses.add(address1);
        addresses.add(address2);

        return addresses;
    }
}
