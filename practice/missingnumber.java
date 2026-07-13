package practice;
import java.util.HashMap;
public class missingnumber {
   public static void main(String[] args) {
    int[] arr={0,2,1,3};
    System.out.println(findmissing(arr));
   }
   public static int findmissing(int[] nums){

        HashMap <Integer,Integer> map=new HashMap<>();
        //store all the numbers
        for(int num:nums){
         map.put(num,1);
        }
        //find the missing number
         for(int i=0; i<nums.length;i++){
             if(!map.containsKey(i)){
               return i;
             }
         }
         return -1;
   }
    
}