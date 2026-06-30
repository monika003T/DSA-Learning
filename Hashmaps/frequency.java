package Hashmaps;
import java.util.*;
public class frequency {
 
   public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
