package practice;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={3,4,4,5,5,6,7,10};
        int target=4;
  int index=linearTarget(arr, target);
  if(index==-1){
      System.out.println("Not Found");
  }
  else{
    System.out.println("Element " + target + " Found at Index" + index);
  }
       
    }
    public static int linearTarget(int[] arr ,int target){
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                // ans=arr[i];
                
                 
                 return i;
            // System.out.println(ans+"index"+ i);
            }
           
            // System.out.println(ans+"at index"+i);
            // System.out.println(ans+"index"+ i);
        }
        // System.out.println(ans+"index");
        return -1;
        
    }
}
