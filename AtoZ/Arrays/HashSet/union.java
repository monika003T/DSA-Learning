package Arrays.HashSet;

import java.util.HashSet;
import java.util.*;
public class union {
    public static void main(String[] args) {
        int nums1[]={1,2,3,4};
        int nums2[]={4,4,3,3,5,5,5,6,7,7};
        System.out.println((unionofSortedArray(nums1, nums2)));
    }
    public static HashSet<Integer> unionofSortedArray(int[] nums1, int[] nums2){
        HashSet<Integer> set= new HashSet<>();
        //copy the array
        for( int num:nums1){
            set.add(num);
        }
        //copy the second
        for(int num:nums2){
       
            set.add(num);
        

        }

        return set;
    }
}
