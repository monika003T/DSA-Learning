package practice;

public class evenCount {
    public static void main(String[] args) {
        int arr[]={2,6,7,9,4};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
            // System.out.println(count);
        }
        System.out.println(count);
    }
}
