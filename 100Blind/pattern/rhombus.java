package pattern;

import java.util.Scanner;

public class rhombus {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int r=1; r<=n;r++){

            //spaces
            for(int c=1;c<=n-r;c++){
             System.out.print(" ");
            }
            //Stars
            for(int c=1;c<=n;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
