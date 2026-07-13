package basicMath;

public class palindrome {
    public static void main(String[] args) {
        int n=1231;
        System.out.println(palindromeCheck(n));
    }
    public static boolean palindromeCheck(int n){
        int dup=n;
        int rev=0;
        while(n>0){
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
       
       return (rev==dup);
    }
}
