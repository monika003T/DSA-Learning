class Solution {

    public static void main(String args[]){
        int[] nums={12,3,4,1,1,1,1,1};
         int k=5;
        System.out.println(longestSubarray(nums,5));
    }
    public static int longestSubarray(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }
}
