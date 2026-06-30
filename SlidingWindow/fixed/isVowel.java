package SlidingWindow.fixed;
import java.util.Scanner;

public class isVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        
        int result=countVowels(s, k);
        System.out.println(result);

        
    }
    public static int countVowels(String s, int k){
        int count=0;
        int maxcount=0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))) count++;

        }
        maxcount=count;
        for(int j=k; j<s.length(); j++){
            if(isVowel(s.charAt(j))) count++;
            if(isVowel(s.charAt(j-k))) count--;
            maxcount=Math.max(maxcount, count);
        }
        return maxcount;

    }
    public static boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}
