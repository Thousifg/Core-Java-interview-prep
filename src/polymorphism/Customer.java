package polymorphism;

// compiletime polymorphism

public class Customer {
    public static void main(String[] args) {
        Myntra m = new Myntra();

        m.purchase(101);
        m.purchase("mobile", 101);
        m.purchase("laptop");
        m.purchase(101, "tablet");
    }
}
