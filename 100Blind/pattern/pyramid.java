package pattern;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int r=1; r<=n;r++){
            //spaces
            for(int c=1;c<=n-r;c++){
                System.out.print(" ");
            }
            //stars
            for(int c=1;c<=2*r-1;c++){
               System.out.print("*");
            }
            //nextlin
            System.out.println();
        }
    }
}
