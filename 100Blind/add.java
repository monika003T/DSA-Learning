import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=m-n;
        System.out.println("Addition of two numbers is "+sum);
        System.out.println(m+n);
        System.out.println(m*n);
        System.out.println(m/n);
        System.out.println(m%n);
    }
}
