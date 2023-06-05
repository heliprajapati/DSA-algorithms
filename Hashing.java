import java.util.*;
 
public class Hashing {
   public static void main(String args[]) {
       //Creation
       HashMap<String, Integer> map = new HashMap<>();
 
       //Insertion
       map.put("UG", 120);
       map.put("USA", 30);
       map.put("India", 150);
 
       System.out.println(map);
 
       map.put("India", 180);
       System.out.println(map);
 
 
       //Searching
       if(map.containsKey("Indonesia")) {
           System.out.println("key is present in the map");
       } else {
           System.out.println("key is not present in the map");
       }
       //searching (2)
       System.out.println(map.get("India")); //key exists
       System.out.println(map.get("Indonesia")); //key doesn't exist
 
       //Iteration (1)
       for( Map.Entry<String, Integer> e : map.entrySet()) {
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }
 
       //Iteration (2)
       Set<String> keys = map.keySet();
       for(String key : keys) {
           System.out.println(key+ " " + map.get(key));
       }
 
       //Removing
       map.remove("India");
       System.out.println(map);
 
   }
}

