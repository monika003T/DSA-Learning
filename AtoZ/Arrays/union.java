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
    
}
