package pattern;

import java.util.Scanner;

public class hollowtriangle {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int r=1; r<=n;r++){
            if(r==1||r==n||r==2){
                for(int c=1;c<=r;c++){
                    System.out.print("* ");
                }
            }else{
                System.out.print("* ");
                for(int c=1;c<=r-2;c++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
