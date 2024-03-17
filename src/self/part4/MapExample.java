package self.part4;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("1key",1);
        scores.put("2key",2);
        scores.put("3key",3);

        for(Map.Entry<String, Integer> entry:scores.entrySet()){
            System.out.println(entry.getKey());
            System.out.println( entry.getValue());
        }
        System.out.println();
        scores.put("2key",4);
        scores.put("4key",2);

        for (Map.Entry<String, Integer> entry :scores.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println();
        scores.remove("key1");
        for ( Map.Entry<String, Integer> entry:scores.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getValue());
        }

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("aa",11);
        testMap.put("bfd",43);

        for(Map.Entry<String, Integer>entry:testMap.entrySet()){
            System.out.println(entry.toString());
        }
    }
}
