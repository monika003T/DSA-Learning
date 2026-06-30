package basics;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            while(n>0){
                int dig= n%10;
                n=n/10;
                System.out.println(dig);
            }
        }
    }
}
