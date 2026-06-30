public class swapth {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=7;
        int d=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        c=c^d; //15
        d=c^d; //5
        c=c^d; //10
        System.out.println("Using Xor c is "+ c);
        System.out.println("Using Xor d is "+ d);
    }
}
