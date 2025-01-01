package com.springcore.autowire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
