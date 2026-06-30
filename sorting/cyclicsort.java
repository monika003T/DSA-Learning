package sorting;// this is the package name where we will keep all our sorting algorithms

import java.util.Arrays;// we will use this to print the array after sorting

public class cyclicsort{
    public static void main(String[] args){
        int arr[]={3,5,2,1,4,-1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr)); // we will get the sorted array because the elements are from 1 to n and we are placing them in their correct positions
    }
    public static void cyclic(int [] nums){
        int i=0; // we will use while loop because we are not sure about the number of iterations
        while(i<nums.length){
            int correct=nums[i]-1; // we will find the correct index of the current element by subtracting 1 from it because the elements are from 1 to n
            if( nums[i] >0 && nums[i] <=nums.length &&nums[i]!=nums[correct]){ // if the current element is not in its correct position then we will swap it with the element at its correct position
                int temp=nums[i];// we will use a temporary variable to store the current element before swapping
                nums[i]=nums[correct];// we will swap the current element with the element at its correct position
                nums[correct]=temp;// we will place the current element in its correct position
            }else{
                i++; // if the current element is already in its correct position then we will move to the next element
            }
        }
    }
}