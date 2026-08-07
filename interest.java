class Account {
    int accno = 123;
    String name = "Maulik";
}

class SavingsAccount extends Account {
    int balance = 100000;
}

class InterestCalculator extends SavingsAccount {
    int interest = balance * 5 / 100;
}

public class interest {
    public static void main(String[] args) {

        InterestCalculator i = new InterestCalculator();

        System.out.println("Account Number is: " + i.accno);
        System.out.println("Name of Account Holder is: " + i.name);
        System.out.println("Balance is: " + i.balance);
        System.out.println("Interest is: " + i.interest);
    }
}