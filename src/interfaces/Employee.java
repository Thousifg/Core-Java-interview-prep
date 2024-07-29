package interfaces;

public class Employee extends Job implements Java, Selenium{
    @Override
    public void develop() {
        System.out.println("developing");
    }

    @Override
    public void test() {
        System.out.println("testing");
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.develop();
        e.test();
        e.work();
    }
}
