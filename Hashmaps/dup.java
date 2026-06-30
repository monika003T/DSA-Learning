package Hashmaps;
import java.util.*;
public class dup {
    public static void main(String[] args) {
        int arr[]={6,7};
        System.out.println(dup(arr));
    }
    public static boolean dup(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if(set.contains(num)) {
                
                 return true;
            }
            set.add(num);
          

        }
        return false;

    }
}
