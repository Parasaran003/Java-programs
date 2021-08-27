import java.util.Scanner;

class cpga {
    float sub1, sub2, sub3, sub4, sub5;
    float cpsub1, cpsub2, cpsub3, cpsub4, cpsub5;
    float cpga, totalgp, totalcp;
    Scanner scan = new Scanner(System.in);

    void detailsgp() {
        System.out.println("Enter the your grade points scored in the subjects(O = 1,A+ = 0.9,A=0.8,B=0.7,C=0.6)");
        System.out.print("Enter the grade point of Subject 1 = ");
        sub1 = scan.nextFloat();
        System.out.print("Enter the grade point of Subject 2 = ");
        sub2 = scan.nextFloat();
        System.out.print("Enter the grade point of Subject 3 = ");
        sub3 = scan.nextFloat();
        System.out.print("Enter the grade point of Subject 4 = ");
        sub4 = scan.nextFloat();
        System.out.print("Enter the grade point of Subject 5 = ");
        sub5 = scan.nextFloat();
    }

    void detailscp() {
        System.out.println("Enter the your credit points of subjects given by your organization");
        System.out.print("Enter the credit point of Subject 1 = ");
        cpsub1 = scan.nextFloat();
        System.out.print("Enter the credit point of Subject 2 = ");
        cpsub2 = scan.nextFloat();
        System.out.print("Enter the credit point of Subject 3 = ");
        cpsub3 = scan.nextFloat();
        System.out.print("Enter the credit point of Subject 4 = ");
        cpsub4 = scan.nextFloat();
        System.out.print("Enter the credit point of Subject 5 = ");
        cpsub5 = scan.nextFloat();
    }

    void calc() {
        totalgp = (cpsub1 * sub1) + (cpsub2 * sub2) + (cpsub3 * sub3) + (cpsub4 * sub4) + (cpsub5 * sub5);
        totalcp = (cpsub1 + cpsub2 + cpsub3 + cpsub4 + cpsub5);
        cpga = (totalgp / totalcp) * 10;
    }

    void result() {
        System.out.println("CPGA Score = " + cpga);
        System.out.println("Thank You Have A Nice Day !");
    }

    public static void main(String[] args) {
        cpga clc = new cpga();
        clc.detailsgp();
        clc.detailscp();
        clc.calc();
        clc.result();
    }
}
