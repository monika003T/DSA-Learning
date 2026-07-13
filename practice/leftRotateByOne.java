package practice;

import java.util.Arrays;

/**
 * leftRotateByOne
 */
public class leftRotateByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int [] arr2={1,2,3,4,50};
        int[] ans=leftRotateArrayByOnePosi(arr);
        System.out.println(Arrays.toString(ans));
        int[] ans2=rightRotateByone(arr2);
        System.out.println(Arrays.toString(ans2));
        
    }
    public static int[] leftRotateArrayByOnePosi(int[] arr){
           
           int temp=arr[0];
           
           for(int i=0; i<arr.length-1;i++){
            
          
            arr[i]=arr[i+1];

            
           }
           // last index with temp va;ue which is from the first index arr[0] 
            arr[arr.length - 1] = temp;
          
           return arr;
    }
    public static int[] rightRotateByone(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        return arr;
    }
    
   
}