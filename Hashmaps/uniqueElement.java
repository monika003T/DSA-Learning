package Hashmaps;

import java.util.Map.Entry;
import java.util.*;

public class uniqueElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        

        // String m=sc.nextLine();

        String s="iwewoi";
        // int nums[]= new int[5];
        // for(int i=0; i<5; i++){
        //     nums[i]=sc.nextInt();
        // }
        // unique(m);
        // firstunique(nums);
        System.out.println(firstUniqChar(s));
    }
    public static void unique(String m) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ch:m.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        for (char ch : m.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
       
    }
    public static void firstunique(int[] nums){
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            //build frequency
            map.put(num,map.getOrDefault(num, 0)+1);

        }
 
            //calculate first unique
            int max=0;
            int ans=-1;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               if(entry.getValue()>max){
               max=entry.getValue();
               ans=entry.getKey();
            }
        }
        
        System.out.println(ans);
    }

    
    public static int firstUniqChar(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        //build freq
        for(char ch:s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //find index
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
             
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;

    }
}

