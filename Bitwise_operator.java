public class Bitwise_operator {
    public static void main(String[] args) {
        int a = 32, b = 16, c;
        c = a & b;
        System.out.println("Bitwise And is : " + c);
        c = a | b;
        System.out.println("Bitwise Or is : " + c);
        c = a ^ b;
        System.out.println("Bitwise XOr is : " + c);
        c = a << 3;
        System.out.println("Bitwise Left shift is : " + c);
        c = a >> 3;
        System.out.println("Bitwise Right shift is : " + c);
    }
}
