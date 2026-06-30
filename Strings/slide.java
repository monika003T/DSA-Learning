public class slide {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5, 5};
        int k = 3;

        int result = maxsum(nums, k);
        System.out.println(result);
    }

    static int maxsum(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int right=0;
        int max = Integer.MIN_VALUE;

        while (right<nums.length) {
            sum += nums[right];

            if (right - left + 1 == k) {
                max = Math.max(max, sum);
                sum -= nums[left];
                left++;
               
            }
            right ++;
        }

        return max;
    }
}
