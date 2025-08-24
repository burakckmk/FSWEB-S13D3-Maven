package org.example;

public class Person {
    // Gerekli instance variable'lar
    private String firstname;
    private String lastName;
    private int age;

    // Ek instance variable'lar
    private String email;
    private String phoneNumber;
    private String address;

    // İlk constructor (firstname, lastName, age)
    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    // İkinci constructor (constructor chaining ile)
    public Person(String firstname, String lastName, int age, String email, String phoneNumber, String address) {
        this(firstname, lastName, age); // Constructor chaining
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter metodları
    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // isTeen metodu
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    // Ek getter metodları
    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}