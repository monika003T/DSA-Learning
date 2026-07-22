package Strings;
public class substrings{
    public static void main(String[] args) {
        String s="abcd";
        int n=123;
       System.out.println(printAll(s));
       System.out.println(convert((n)));
    }
    public static int printAll(String s){
        int n=s.length();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n;j++){
               
                 String ans = s.substring(i, j);
            System.out.println("Substrings "+ans);
            }
        }
        return n*(n+1)/2;
   /*Time Complexity: O(n³) in the worst case (generating and copying all substrings).
Auxiliary Space: O(1) (excluding the space used by the output strings themselves).

Interview note: If you're only counting the number of substrings without creating them, the complexity is O(n²). 
But actually creating and printing each substring takes additional time proportional to its length, leading to O(n³) overall. */
       
    }
    //take integer input and convert to a string
    public static String convert(int n){
        String s = String.valueOf(n);
        // String s="";
        // s+=n;
        System.out.println(s.getClass().getSimpleName());
        return s;

    }
}
