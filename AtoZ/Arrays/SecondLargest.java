package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] nums={-9,-8,-3,-2,-1,0,1};
        System.out.println(secondLargestElement(nums));
    }
    public static int secondLargestElement(int[] nums){
        int largest=nums[0];
        int second=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                second=largest;
                largest=nums[i];
            }
            if(nums[i]<largest && nums[i]>second){
                second=nums[i];
            }
        }return second;
    }
}
