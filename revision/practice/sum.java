package revision.practice;

public class sum {
 public static void main(String[] args) {
    int[] arr={3,4,5,6,7};
    int sum=0;
    for(int i=0; i<arr.length;i++){
      sum+=arr[i];
    //   System.out.println(sum);
    }
    System.out.println(sum);
 }   
}
//tc -O(n) loop runs n times
//sc-O(1) only one loop 