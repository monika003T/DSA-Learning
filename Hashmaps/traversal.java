package Hashmaps;

import java.util.*;

public class traversal {
  


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Riya", 85);
        map.put("Aman", 90);
        map.put("Priya", 80);

        System.out.println(map);

        System.out.println(map.get("Aman"));

        // Traversal
        for(String key : map.keySet()) { // keySet() method returns a set of keys in the map
            System.out.println(key + " -> " + map.get(key));
        }
        System.out.println("Using entrySet() method:");
        for(HashMap.Entry<String,Integer> entry: map.entrySet()){ // entrySet() method returns a set of key-value pairs
            System.out.println(entry.getKey() + " -> " + entry.getValue()); // getKey() method returns the key and getValue() method returns the value of the entry
        }
    }
}

