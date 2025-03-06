package hashing;

import java.util.*;

public class One {
    public static void main(String args[]) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("India", 150);
        hm.put("China", 140);
        hm.put("usa", 90);
        hm.put("srilanka", 40);
        hm.put("bhutan", 8);

        // System.out.println(hm.get("India"));
        // System.out.println(hm.containsKey("usa"));
        // System.out.println(hm.remove("usa"));
        // System.out.println(hm.remove("usa"));
        // System.out.println(hm);
        // System.out.println(hm.size());
        // System.out.println(hm.isEmpty());
        // hm.clear();
        // System.out.println(hm.isEmpty());

        System.out.println(hm);
        // iteration on hashmap
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println("key= " + k + " , " + hm.get(k));
        }

    }
}
