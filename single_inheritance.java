import java.util.Scanner;

class details {
    String name, rollno;
    int phy, chem, math, eng, bio, total;
    float average;
    Scanner scan = new Scanner(System.in);

    void details() {
        System.out.print(" Enter the name : ");
        name = scan.next();
        System.out.print(" Enter the register number : ");
        rollno = scan.next();
    }
}

class single_inheritance extends details {
    void calc() {
        System.out.print("Enter the physics marks");
        phy = scan.nextInt();
        System.out.print("Enter the chemistry marks");
        chem = scan.nextInt();
        System.out.print("Enter the mathematics marks");
        math = scan.nextInt();
        System.out.print("Enter the english marks");
        eng = scan.nextInt();
        System.out.print("Enter the biology marks");
        bio = scan.nextInt();
        total = (phy + chem + math + eng + bio);
        average = total / 5;
    }

    void display() {
        System.out.println(" Name of the student : " + name);
        System.out.println(" Register NUmber : " + rollno);
        System.out.println(" Total Marks : " + total);
        System.out.println(" Average Marks of the Student : " + average);
    }

    public static void main(String[] args) {
        marks tot = new marks();
        tot.details();
        tot.calc();
        tot.display();
    }
}
