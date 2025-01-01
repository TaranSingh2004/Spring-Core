package lifecycle;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("inside set method");
        this.price = price;
    }

    public Samosa() {
        super();
    }

    public Samosa(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("inside init method");
    }
    public void destroy(){
        System.out.println("inside the destroy method");
    }
}
