import java.util.Scanner;

class bal {
    Scanner scan = new Scanner(System.in);
    double min_bal, saving_bal;

    void balance(int m, int s) {
        min_bal = m;
        saving_bal = s;
        System.out.println("Minimum Balance = " + min_bal);
        System.out.println("Saving Balance = " + saving_bal);
    }
};

class account extends bal {
    String name, acc_type, bank_name;
    double amount, acc_no;

    void details() {
        System.out.print("Enter the name :");
        name = scan.next();
        System.out.print("Enter the bank name :");
        bank_name = scan.next();
        System.out.print("Enter the account number = ");
        acc_no = scan.nextDouble();
        System.out.print("Enter the account type(current or savings) : ");
        acc_type = scan.next();
        System.out.print("Enter the amount : ");
        amount = scan.nextDouble();
    }
};

class calc extends account {
    char w, d, choice;
    double deposit, withdraw, bal;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Bank Name : " + bank_name);
        System.out.println("Account Number : " + acc_no);
        System.out.println("Account Type : " + acc_type);
        System.out.println("Amount : " + amount);
    }

    void calculation() {
        System.out.println("Enter the amount need to be withdrawed or deposited : ");
        System.out.print("Enter w for withdrwal and d for deposit : ");
        choice = scan.next().charAt(0);
        if (choice == 'w') {
            System.out.print("Enter the amount needs to be withdrawed = ");
            withdraw = scan.nextDouble();
            bal = amount - withdraw;
            System.out.println("Balance amount after withdrawal = " + bal);
        } else {
            System.out.print("Enter the amount needs to be deposited = ");
            deposit = scan.nextDouble();
            bal = amount + deposit;
            System.out.println("Balance amount after deposition = " + bal);
        }
    }
};

public class bank {
    public static void main(String[] args) {
        bal balan = new bal();
        balan.balance(1000, 10000);
        calc det = new calc();
        det.details();
        det.display();
        det.calculation();
    }
}