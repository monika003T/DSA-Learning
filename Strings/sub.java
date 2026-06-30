import java.util.*;
public class sub {
    public static void main(String[] args) {
       String str = "abcde";
       System.out.println(getsubstrings(str));
       convert(str);
       String s= "monika";
       String t="monika";
       System.out.println(t);
       System.out.println(s);
       s="aalu";
       t=s;
       System.out.println(s);
       System.out.println(t);
       String m= new String("monika");System.out.println(m);
       reverse(str);
       System.out.println(palindrome("maam"));
    

    
    }
    static String getsubstrings(String str){
        String result = "";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                result += str.substring(i,j) + " ";
            }
        }
        return result;
    } 
   static void convert(String str){
    
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    String ans=""+a;
    System.out.println(ans);
    // System.out.println();
    System.out.println(ans.length());
}
// reverse a string 
static void reverse(String str){
    str="hello";
    int n=str.length();
    for(int i=n-1; i>=0; i--){
        char ch= str.charAt(i);
        System.out.print(ch);
    }
    System.out.println();
  
}
// palindrome 
    static boolean palindrome(String str){
    int i =0,n=str.length(),j=n-1;
    while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
    }

 //consonants and vowels
 
 //String builders
 StringBuilder sb= new StringBuilder("Monika");
 
}