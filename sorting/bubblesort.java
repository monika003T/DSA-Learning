
package sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args){
        int arr[]={1,2,3,5,4,5,6,};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr[]){
        for(int i=0; i<arr.length;i++){
             boolean swapped=false;
            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }if(!swapped) break;
        }
    }
}
