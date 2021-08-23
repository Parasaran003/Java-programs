class javaprogram {
    public static void main(String[] args) {
        int a = 34, b = 78, c = 23;
        boolean d;
        d = a > c && b > a && c > b;
        System.out.println("And - all True: " + d);
        d = a < c || b > a || b < c;
        System.out.println("Or - any one True: " + d);
        d = !(a < c || b > a || b < c);
        System.out.println("Not - True means False. " + d);
    }
}