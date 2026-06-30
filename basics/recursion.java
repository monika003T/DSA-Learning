package basics;
public class recursion {
    public static void main(String[] args) {
        int ans = fact(-1);
        int sum= sumdigit(1342);
        int rev= reversenumber(1824,0);
        int product=productofdigit(13042);
        System.out.println(ans+","+sum+","+rev+","+product+","+ispalindrome(123321));
        System.err.println(countzeros(102030));
        
        }    // factorial of n
    static int fact( int n ){
        if( n<=1){
            return 1;
        }
        return n+fact(n-1);
    }
    // sum of digit
    static int sumdigit(int n){
        if(n==0){
            return 0;
        }
        return n%10+ sumdigit(n/10);
    }
    // product of digits
    static int productofdigit( int n){
        if( n%10==n){
            return n;
        }
        return n%10 * productofdigit(n/10);
    }
    
    //reverse of a number
    static int reversenumber( int n, int rev){
        
        if(n==0){
            return rev; 
        }
        
        return reversenumber(n/10,rev*10 +n%10);
    }
    // palindrome of number if reverse is equal to the original numbers 
    static boolean ispalindrome(int n ){
      return n==  reversenumber(n, 0);
    }
   static int countzeros(int n){
    
    if(n==0){
        return 0;
    }
    int count=n%10==0?1:0;
    return count + countzeros(n/10);
    
   }
}
