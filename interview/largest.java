import java.util.*;
public class largest{
    public static void main(String[] args) {
       int[] arr={-3,5,-2,-9};
       System.out.println(largestNumber(arr));
       System.out.println(SmallestNumber(arr));
    }
    public static int largestNumber(int[] nums){
        int largest=Integer.MIN_VALUE;
        for(int num:nums){
           if(num>largest){
            largest=num;
           }
        }
        return largest;
    }
//Smallest lement
public static int SmallestNumber(int[] nums){
    int smallest=Integer.MAX_VALUE;
    for(int num: nums){
        if(num<smallest){
            smallest=num;
        }
    }
    return smallest;
}


}

