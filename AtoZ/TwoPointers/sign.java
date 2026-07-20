package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class sign {
    public static void main(String[] args) {
        int[] nums={1,2,-3,4,5,6,-1,-7,-5,-9};
        System.out.println(Arrays.toString(rearrange(nums)));
    }
    public static int[] rearrange(int[] nums){
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for(int num:nums){
            if(num>=0){
                positive.add(num);
            }
            else{
                negative.add(num);
            }
        }
        int[] ans=new int[nums.length];
        int p=0;
        int q=0;
        for(int i=0; i<nums.length; i+=2){
            ans[i]=positive.get(p++);
            ans[i+1]=negative.get(q++);
        }
        return ans;
    }
}
