package com.studentaddressapp.student.model;

//import org.hibernate.annotations.Table;

//import javax.persistence.Entity;

import com.studentaddressapp.address.model.Address;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "hobby")
    private String hobby;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Student() {

    }

    public Student(int studentID, String firstName, String lastName, int age, String hobby, Address address) {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setHobby(hobby);
        setAddress(address);
    }

    // Getters

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public Address getAddress() {
        return address;
    }

    // Setters

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
