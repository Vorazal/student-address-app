package com.studentaddressapp.address.service;

import com.studentaddressapp.address.model.Address;
import com.studentaddressapp.address.repository.AddressRepository;
import com.studentaddressapp.exceptions.DuplicateEntityException;
import com.studentaddressapp.exceptions.EntityNotFoundException;

public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address getAddressID(int id) {

        return addressRepository.getAddressID(id);
    }

    @Override
    public void createNewAddress(Address address) {

        boolean duplicateExists = true;

        try {
            addressRepository.getAddressID(address.getAddressID());
        }
        catch (EntityNotFoundException e) {
            duplicateExists = false;
        }

        if (duplicateExists) {
            throw new DuplicateEntityException("Address", "id", String.valueOf(address.getAddressID()));
        }

        addressRepository.createNewAddress(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.updateAddress(address);
    }

    @Override
    public void deleteAddress(int id) {
        addressRepository.deleteAddress(id);
    }

}
