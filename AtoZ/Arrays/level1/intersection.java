package Arrays.level1;

import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
        int[] nums1={1,2,2,3};
        int[] nums2={3,4,2,2};
        System.out.println(intersectionOfArrays(nums1, nums2));
        
    }
    public static ArrayList<Integer> intersectionOfArrays(int[] nums1, int[] nums2){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums1.length;i++){
            boolean alreadyPresent = false;
            for(int j=0; j<nums2.length;j++){
                
                if(nums1[i]==nums2[j]){
                    
                    list.add(nums1[i]);
                   alreadyPresent = true;
                    break;

                } 
                
            }
            if(!alreadyPresent){
                    list.add(nums1);
                }
        }
        // int[] result = new int[list.size()];
        // for(int k=0;k<list.size();k++){
        //     result[k]=list.get(k);
        // }
        // return result;
        return list;
    }
}
