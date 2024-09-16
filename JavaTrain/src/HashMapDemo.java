import java.util.*;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer ,String> mp= new HashMap<>();
        mp.put(1,"rachit");
        mp.put(4,"raj");
        mp.put(3,"ram");
        mp.put(2,"riya");

        System.out.println(mp);// sorts the data according to key value
        // (unordered collection as it doesnt guarantee any specify order)
        System.out.println(mp.get(2));
        System.out.println(mp.isEmpty());
        //entryset gives all values key->value
        //key set gives keys
        //values gives values
        // not thread safe

        Set<Integer> NameKey=mp.keySet();
        System.out.println(NameKey);

        Collection <String> Values=mp.values();
        System.out.println(Values);

        Set<Map.Entry<Integer,String>>entries=mp.entrySet();
        System.out.println(entries);
        System.out.println(mp);

    }
}
