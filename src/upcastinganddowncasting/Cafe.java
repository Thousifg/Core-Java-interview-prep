package upcastinganddowncasting;

public class Cafe {
    Bevarages vending(int choice){
        if(choice == 1){
            return new Tea();
        }
        else if(choice == 2){
            return new Coffee();
        }
        else {
          return null;
        }
    }
}
