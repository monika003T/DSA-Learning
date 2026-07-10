package basicMath;

public class reverseNumber {
    public static void main(String[] args) {
        int n=-123;
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
      
       int rev=0;
       while(n>0){
       int lastdigit=n%10;
        rev=rev*10+lastdigit;
        n=n/10;
       }
       return rev;

    }
}
