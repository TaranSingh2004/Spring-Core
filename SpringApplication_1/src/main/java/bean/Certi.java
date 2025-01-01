package bean;

public class Certi {
    public Certi(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
}
