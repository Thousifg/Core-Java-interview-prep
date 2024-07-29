package abstraction;

public class User extends Car{
    void start(){
        System.out.println("car started");
    }
    void stop(){
        System.out.println("car started");
    }

    public static void main(String[] args) {
        User u = new User();

        u.start();
        u.shiftGears();
        u.stop();
    }
}
