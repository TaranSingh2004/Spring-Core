package bean;

public class Person {
    private String name;
    private int personId;
    private Certi certi;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                '}';
    }

    public Person(String name, int personId, Certi certi) {
        this.name = name;
        this.personId = personId;
        this.certi = certi;
    }

}
