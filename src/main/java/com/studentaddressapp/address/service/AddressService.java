package com.studentaddressapp.address.service;

import com.studentaddressapp.address.model.Address;

public interface AddressService {

    Address getAddressID(int id);

    void createNewAddress(Address address);

    void updateAddress (Address address);

    void deleteAddress(int id);
}
