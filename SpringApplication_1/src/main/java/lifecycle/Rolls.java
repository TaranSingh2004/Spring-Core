package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Rolls {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Rolls() {
        super();
    }

    @Override
    public String toString() {
        return "Rolls{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void start(){
        System.out.println("annotation init");
    }

    @PreDestroy
    public void last(){
        System.out.println(" annotation destroy");
    }
}
