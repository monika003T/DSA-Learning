package practice;


import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Monika", 22);
        map.put("Siddhi", 18);
        map.put("Krish", 12);
        map.put("Adarsh", 19);
        map.put("Sneha", 23);
        map.put("Lucky", 29);
        System.out.println(map);
        map.putIfAbsent("aryan",20 );
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());


        //traversing all the entries in the hashmap
        //1
        for(String key:map.keySet()){
            System.out.printf("Age of %s is %d\n",key,map.get(key));
        }
        //2
        System.out.println();
        for(Entry<String, Integer> e:map.entrySet()){
                System.out.printf("Age of %s is%d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        for(var e:map.entrySet()){
            System.out.printf("Age of %s is%d\n",e.getKey(),e.getValue());
        }

    }
}