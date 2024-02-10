import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String> mp = new HashMap<>();
        mp.put(3,"Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        mp.put(1, "Priya"); //over-rides
        // Iterating over values in a map
        // for (String i : mp.values()) {
        //     System.out.println(i);
        // }
        // for (int i : mp.keySet()) {
        //     System.out.println(i);
        // }
        // for (var i : mp.keySet()) {
        //     System.out.println(i);
        // }
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.isEmpty());
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Riya"));
        for (var e : mp.entrySet()) {
            System.out.println(e);
        }
    }
    
}
