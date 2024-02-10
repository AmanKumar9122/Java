import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> mp = new LinkedHashMap<>();
        mp.put(3,"Aman");
        mp.put(1, "Rohan");
        mp.put(2, "Riya");
        mp.put(1, "Priya"); //over-rides
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
