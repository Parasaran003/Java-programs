import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        float bmi, metric_height;
        float weight, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight = ");
        weight = input.nextFloat();
        System.out.print("Enter the height = ");
        height = input.nextFloat();
        metric_height = height / 100;
        bmi = (weight) / (metric_height * metric_height);
        System.out.println("Bmi of the person = " + bmi);
    }
}
