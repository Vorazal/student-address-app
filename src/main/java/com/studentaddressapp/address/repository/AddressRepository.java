package com.studentaddressapp.address.repository;

import com.studentaddressapp.address.model.Address;

public interface AddressRepository {
    Address getAddressID(int id);
    void createNewAddress(Address address);
    void updateAddress(Address address);
    void deleteAddress(int id);
}
