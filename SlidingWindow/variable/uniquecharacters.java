
// Longest Substring without repeating characters
package SlidingWindow.variable;
import java.util.HashSet;
import java.util.Scanner;
public class uniquecharacters {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // int testcases=sc.nextInt();
        // sc.nextLine();
        // while(testcases-->0){
        //     String s=sc.nextLine();
        //     System.out.println(longestString(s));

        // }
        while(sc.hasNextLine()){   // keep reading until input ends

            String s = sc.nextLine();

            if(s.isEmpty()) break;

            System.out.println(longestString(s));
        }
        
    }
    public static int longestString(String s){
        int left=0;
        int maxlength=0;
        HashSet <Character> set= new HashSet<>();
        for(int right=0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
            
                set.remove(s.charAt(left));
                left++;

            }
            set.add(s.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
