package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer  , String> map = new HashMap<>();
        map.put(1 , "Guru");
        map.put(2 , "Susmita");
        map.put(32 , "gita");
        map.put(21, "ranu");
        map.put(9 , "Hari");
        System.out.println(map);
        String  a  = map.get(2);
        System.out.println(a);

        // For both key and value
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //for only key

        Iterator<Integer> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()){
            Integer key = iterator1.next();
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }

        // Using java 8

        map.keySet().stream().forEach(System.out::println);
        map.entrySet().stream().forEach(System.out::println);



    }
}
