package practice;

public class sorted {
    public static void main(String[] args) {
        int[] arr={1,3,4};
        boolean ans=sortedOrNot(arr);
        if(ans==true){
            System.out.println("array is sorted");
        }else{
            System.out.println("unsorted");
        }

    }
    public static boolean sortedOrNot(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
           
        }
        return true;
    }
}
