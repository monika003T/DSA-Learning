package practice;

public class minimum {
    public static void main(String[] args) {
        int[] arr={2,3,5,8,9};
        int smallest=arr[0];
        

        for(int i=0; i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
                
            }
            
        }System.out.println(smallest);
    }
}
// tc= O(n) sc=O(1)

