package Arrays;
import java.util.*;
public class union {
    public static void main(String[] args) {
        int[] numsa={1,2,3,4};
              int[] numsb={2,3,5};
              

   System.out.println(Arrays.toString(arraysunion(numsa, numsb)));

    }
    public static int[] arraysunion(int[] a,int[] b){
              int n=a.length;
              int m=b.length;
              int[] temp=new int[n+m];
              int index=0;
             //copy the first array 
             for(int i=0; i<n;i++){
                temp[index]=a[i];
                index++;
             }
             //check if element already in second
             for(int i=0;i<m;i++){
                boolean found= false;
                for(int j=0; j<index;j++){
                    if(b[i]==temp[j]){
                        found =true;
                        break;
                    }
                }
                if(!found){
                    temp[index]=b[i];
                    index++;
                }
             }
             //return array of correct size
             return Arrays.copyOf(temp,index);
    }

     public List<Integer> FindUnion(int[] arr1, int[] arr2, int n, int m) {
        // Create TreeMap to store elements in sorted order
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        // Loop through first array and store frequency
        for (int i = 0; i < n; i++)
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
        // Loop through second array and store frequency
        for (int i = 0; i < m; i++)
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        // Create a list to store union result
        List<Integer> Union = new ArrayList<>();
        // Traverse map keys and add to union list
        for (int key : freq.keySet())
            Union.add(key);
        // Return the union list
        return Union;
    }
    
}
