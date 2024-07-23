package upcastinganddowncasting;

public class User {
    public static void main(String[] args) {
        Cafe c = new Cafe();
        Bevarages obj = c.vending(1);

        if(obj instanceof Tea){
            System.out.println("Tea");
        }
        else if(obj instanceof Coffee){
            System.out.println("Coffee");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
