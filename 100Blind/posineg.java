import java.util.Scanner;

public class posineg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            System.out.println("Given number is positive");
        }else{
            System.out.println("Given number is negative");
        }
    }
}
