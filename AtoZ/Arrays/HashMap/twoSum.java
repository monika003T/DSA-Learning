package Arrays.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum{
    public static void main(String[] args) {
        int[] nums={0,3,5,2,7};
        int target=9;
        System.out.println(Arrays.toString(two(nums, target)));
        System.out.println(Arrays.toString(opti(nums, target)));
    }
    public static int[] two(int[] nums , int target){
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] opti(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i );

        }
        return new int[]{-1,-1};
    }
}