package practice;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8};
        reverseArray(arr);
    }
    public  static void reverseArray(int[] arr){
       
        for(int i=arr.length-1;i>=0;i--){
           System.out.println(arr[i]);
        }
        
        
        
        

    }
}
