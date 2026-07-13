package basicMath;
/*You are given two integers n1 and n2. You need find the Greatest Common Divisor (GCD) of the two given numbers. Return the GCD of the two numbers.



The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.


Example 1

Input: n1 = 4, n2 = 6

Output: 2

Explanation: Divisors of n1 = 1, 2, 4, Divisors of n2 = 1, 2, 3, 6

Greatest Common divisor = 2.

Example 2

Input: n1 = 9, n2 = 8

Output: 1

Explanation: Divisors of n1 = 1, 3, 9 Divisors of n2 = 1, 2, 4, 8.

Greatest Common divisor = 1.
 gcd of two number will be minimum of two no. greatest common divisor 
*/
public class GCDof{
    public static void main(String[] args) {
        int a=-1; int b=0;
        System.out.println(gcd(a,b));
        System.out.println(euclidean(a, b));
        System.out.println(euci(a, b));
    }
     static int gcd(int a,int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        
       int res=Math.min(a,b);
       while(res>0){
           if(a%res==0 && b%res==0){
            break;
            
            
           } res--;
       }
        return res;
        
    }
    static int euclidean(int a, int b){
        a = Math.abs(a);
    b = Math.abs(b);
        if(b==0) return a;
        else return euclidean(b,a%b);
    }
    static int euci(int a,int b){
        a = Math.abs(a);
    b = Math.abs(b);
    if(a==0) return b;
    if(b==0) return a;
        while(a!=b){
            if(a>b){
            a=a-b;

        }else {
            b=b-a;
        }
    }
        return a;
} 
    }
    

