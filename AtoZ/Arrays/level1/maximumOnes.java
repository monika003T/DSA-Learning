package Arrays.level1;

public class maximumOnes {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,1,3,1,1,1,1,1,}
        ;
        System.out.println(consecutive(nums));
    }
    public static int consecutive(int[] nums){
        int max=0;
        int count=0;
        for(int num:nums){
            if(num==1){
                count++;
                max=Math.max(count,max);
            }
            else count=0;
        }
      return max;
    }
}
