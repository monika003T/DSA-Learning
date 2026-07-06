package practice;
import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 6, 6};
        frequencyOfElement(arr);
    }

    public static void frequencyOfElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}
