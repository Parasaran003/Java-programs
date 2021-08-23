public class Conditional_operator {
    public static void main(String[] args) {
        int a = 15, b = 60, c, d;
        c = a > b ? a : b;
        System.out.println("The Highest Number = " + c);
        a = 25;
        b = 38;
        c = 48;
        d = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The Highest Number = " + d);
    }
}
