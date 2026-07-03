package practice;

public class secondLargest {
    public static void main(String[] args) {
        
        int[] arr={8,7,5};
        System.out.println(secondlargestElement(arr));
    }
    public static int secondlargestElement(int[] arr){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
                
            }
            //agr array of i is less then largest and greater then second largest then what should be do second =arr[i]
            else if(arr[i]<largest && arr[i]>second){
                second=arr[i];
            }
           
        
    }
    return second;
}
}
