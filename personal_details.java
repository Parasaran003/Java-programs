import java.util.Scanner;

public class personal_details {
    public static void main(String[] args) {
        int age;
        float average, maths, phy, chem, bio, eng, total, percentage;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = input.next();
        System.out.print("Enter the Rollno : ");
        String rollno = input.next();
        System.out.print("Enter the age : ");
        age = input.nextInt();
        System.out.print("Enter the department : ");
        String dept = input.next();
        System.out.print("Enter the college name : ");
        String college = input.next();
        System.out.print("Enter the marks(out of marks) : ");
        maths = input.nextInt();
        phy = input.nextInt();
        chem = input.nextInt();
        bio = input.nextInt();
        eng = input.nextInt();
        total = (maths + phy + chem + bio + eng);
        percentage = (total / 500) * 100;
        System.out.println("Name : " + name);
        System.out.println("Register Number : " + rollno);
        System.out.println("Age : " + age);
        System.out.println("College : " + college);
        System.out.println("Department : " + dept);
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
    }
}
