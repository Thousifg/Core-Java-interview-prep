package interfaces;

public class AccountHolder implements ReserveBank{
    @Override
    public void deposit() {
        System.out.println("deposited");
    }
    public void withdraw(){
        System.out.println("withdrawn");
    }

    public static void main(String[] args) {
        AccountHolder a = new AccountHolder();
        a.deposit();
        a.withdraw();
    }
}
