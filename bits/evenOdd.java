package bits;

import java.util.*;

public class evenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        System.out.println("Number is : "+num(n));
    }
    public static boolean num(int n){
        return (n&1)==1;
    }
}
