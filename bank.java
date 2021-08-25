import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        char choice, w;
        double acc_no, amount, balance, deposit, withdraw;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name = ");
        String name = input.next();
        System.out.print("Enter the Account type(Savings or Current Account) = ");
        String acc_type = input.next();
        System.out.print("Enter the Bank Name = ");
        String bank_name = input.next();
        System.out.print("Enter the Account Number = ");
        acc_no = input.nextDouble();
        System.out.print("Enter the Amount = ");
        amount = input.nextDouble();
        System.out.println("Name : " + name);
        System.out.println("Bank Name : " + bank_name);
        System.out.println("Account number : " + acc_no);
        System.out.println("Account type : " + acc_type);
        System.out.println("Amount : " + amount);
        System.out.println("Enter the amount to be deposited or withdraw : ");
        System.out.print("Enter W for withdraw and D for Deposit :");
        choice = input.next().charAt(0);
        if (choice == 'w') {
            System.out.print("Enter the amount to be withdrawed : ");
            withdraw = input.nextDouble();
            balance = amount - withdraw;
            System.out.println("Balance = " + balance);
        } else {
            System.out.print("Enter the amount to be deposited : ");
            deposit = input.nextDouble();
            balance = amount + deposit;
            System.out.println("Balance = " + balance);
        }
    }
}
