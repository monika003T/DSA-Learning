import java.util.*;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
         System.out.print("Write the number You want to check :");
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            
        
      
        evenAndodd(n);
        
    }
    public static void evenAndodd(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is Odd");
        }
    }
}
