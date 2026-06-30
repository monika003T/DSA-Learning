package basics;
import java.util.Scanner;

public class printd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int nod=0;
            int temp= n;
            while(n!=0){
                temp=temp/10;
                nod++;
            }
            // div case 
            int div= (int)Math.pow(10, nod-1);
            while(div!=0){
                int q= n/div;
                System.out.println(q);
            
                
                n=n%div;
                div=div/10;  
   }
        }
        
        }
        
         }

