package sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args){
        int arr[]={1,2,4,5,6,};
        selection(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }
}
