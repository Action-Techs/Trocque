package com.example.StoreFront.users;

public class Users {
    private Integer id;
    private String firstName;
    private String lastName;
    private String role;
    private String address;
    private String email;

    public Users() {
    }

    public Users(Integer id,
                 String firstName,
                 String lastName,
                 String role,
                 String address,
                 String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.address = address;
        this.email = email;
    }

    public Users(String firstName,
                 String lastName,
                 String role,
                 String address,
                 String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.address = address;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
