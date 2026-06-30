package basics;
import java.util.Scanner;

public class primef {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
            for(int div=2; div*div<=n;div++){
                while(n%div==0){
                    n=n/10;
                    System.out.println(n);
                }
            }
            if(n!=0){
                System.out.println(n);
            }
        }
    }
}
