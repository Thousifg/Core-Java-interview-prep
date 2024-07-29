package interfaces;

public class Gullu implements Person{
    @Override
    public void eat() { // always check access specifier it has to public or higher visibility because interface methods have public and abstract implicitly
        System.out.println("Eating Biryani!");
    }

    public static void main(String[] args) {
        Gullu g = new Gullu();
        g.eat();
        System.out.println(Person.id);
    }
}
