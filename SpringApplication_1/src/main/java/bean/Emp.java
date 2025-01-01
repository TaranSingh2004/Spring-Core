package bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String,String> courses;
    private Map<String,String> properties;

    public Emp() {
        super();
    }

    public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Map<String, String> properties) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public void display() {
        System.out.println("name: " +name);
        System.out.println("phones:" +phones);
        System.out.println("addresses:" +addresses);
        System.out.println("courses:" +courses);
        System.out.println("properties: "+ properties);
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
