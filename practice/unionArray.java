package practice;

import java.util.ArrayList;

public class unionArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,4};
        int[] nums2={2,3,5,6};
        System.out.println(unionOdTwoSortedArray(nums1, nums2));
    }
    public static ArrayList<Integer> unionOdTwoSortedArray(int[] nums1,int[] nums2){
        int i=0,j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            //case 1
            if(nums1[i]<nums2[j]){
                ans.add(nums1[i]);
                i++;
            }
            else if (nums1[i]>nums2[j]){
                ans.add(nums2[j]);
                j++;
            }
            else if(nums1[i]==nums2[j]){
                ans.add(nums2[j]);
                
                
            }
            

        }
        return ans;

    }
}
