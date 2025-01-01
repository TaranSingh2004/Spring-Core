package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("ob")
public class Student {
    @Value("taran singh")
    private String StudentName;
    @Value("fbd")
    private String city;

    @Value("#{temp}")
    private List<String> address;

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentName='" + StudentName + '\'' +
                ", city='" + city + '\'' +
                ", address=" + address +
                '}';
    }
}
