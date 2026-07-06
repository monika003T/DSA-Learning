package practice;

import java.util.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int ans=secondSmallest(arr);
        System.out.println(ans);
    }
   public static int secondSmallest(int[] arr) {

    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {

        if (arr[i] < smallest) {
            secondSmallest = smallest;
            smallest = arr[i];
        }
        else if (arr[i] > smallest && arr[i] < secondSmallest) {
            secondSmallest = arr[i];
        }
    }

    if (secondSmallest == Integer.MAX_VALUE) {
        return -1;
    }

    return secondSmallest;
}
}
