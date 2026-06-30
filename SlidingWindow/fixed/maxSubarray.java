package SlidingWindow.fixed;

public class maxSubarray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 4;
        System.out.println(maxSubarraySum(arr, k));
    }
   public static double maxSubarraySum(int arr[], int k) {
    if(k > arr.length) return -1;
   int left=0,sum=0;
   int maxSum=Integer.MIN_VALUE;
   for(int right=0; right<arr.length;right++){
    sum+=arr[right];
    if(right-left+1==k){
        maxSum=Math.max(maxSum, sum);
        sum-=arr[left];
        left++;
    }

   }
   return (double)maxSum/k;
}
}
