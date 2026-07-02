package practice;

public class larSmall {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,6};
        System.out.println("Smallest is "+LargestAndSmallest(arr));

    }
    public static int LargestAndSmallest(int[] arr){
        int largest=arr[0];
        int smallest=arr[0];
         for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
               
            }if(arr[i]<smallest){
                smallest=arr[i];
            }
         }
          System.out.println("Largest is " + largest);
         return smallest;
    }
}
