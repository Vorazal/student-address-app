package com.studentaddressapp.address.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.studentaddressapp.address.model.Address;
import com.studentaddressapp.exceptions.EntityNotFoundException;

public class AddressRepositoryImpl implements AddressRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public AddressRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Address getAddressID(int id) {

        try (Session session = sessionFactory.openSession()) {

            Address address = session.get(Address.class, id);

            if (address == null) {
                throw new EntityNotFoundException("Address", id);
            }
            return address;
        }
    }

    @Override
    public void createNewAddress(Address address) {
        try (Session session = sessionFactory.openSession()) {
            session.save(address);
        }

    }

    @Override
    public void updateAddress(Address address) {

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(address);
            session.getTransaction().commit();
        }
    }

    @Override
    public void deleteAddress(int id) {

        Address address = getAddressID(id);

        try (Session session = sessionFactory.openSession()) {

            session.beginTransaction();
            session.delete(address);
            session.getTransaction().commit();
        }
    }

}
