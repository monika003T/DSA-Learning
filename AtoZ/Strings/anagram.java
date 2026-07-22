package Strings;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s="abc";
        String t="cba";
        System.out.println(compare(s,t));
        System.out.println(optimized(s, t));
    }
    public static boolean compare(String s,String t){
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(int i=0; i<ch1.length;i++){
            boolean found = false;
            for(int j=0; j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    found=true;
                    ch2[j]='#';
                    break;
                }

            }
            if(!found) return false;
        }
        return true;
    }



    /*Check lengths.
Create HashMap<Character, Integer>.
Traverse the first string and increase frequencies.
Traverse the second string and decrease frequencies.
If any frequency becomes negative or a character doesn't exist, return false. */
    public static boolean optimized(String s, String t){
        HashMap<Character,Integer> map=new HashMap<>();
        if (s.length() != t.length())
    return false;
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        
        for(char num:ch1){
            map.put(num,map.getOrDefault(num, 0)+1);

        
        }
        for(char ch:ch2){
            if(!map.containsKey(ch)) return false; 
             map.put(ch, map.get(ch) - 1);
              
        }
        return true;
       
        
    }

}