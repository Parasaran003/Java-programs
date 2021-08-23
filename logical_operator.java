public class logical_operator {
    public static void main(String[] args) {
        int a = 32 , b = 48 , c = 64 ;
        boolean d;
        d = (a>b)&&(b>c)&&(c>a);
        System.out.println("And-All conditions are true!"+d);
        d = (a>b)||(b>c)||(c>a);
        System.out.println("Or-Anyone of conditions are true!"+d);
        d = !((a>b)&&(b>c)&&(c>a));
        System.out.println("Not-True means false and False means True"+d);
    }
}
