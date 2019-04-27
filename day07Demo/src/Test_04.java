import java.util.*;

public class Test_04 {
    public static void main(String[] args) {
        //Map<Integer , String> map = new HashMap<>(17 , 0.6f);
        //Map<Integer , String> map = new Hashtable<>();
        Map<Integer , String> map = new LinkedHashMap<>();
        map.put(1 , "tom");
        map.put(4 , "jack");
        map.put(3 , "lucy");
        map.put(2 , "lily");
        //map.put(null,null);

        System.out.println(map.get(3));
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        entries.forEach(s-> System.out.println(s));
        System.out.println("-----------------");
        map.remove(2);
        Set<Map.Entry<Integer, String>> entries1 = map.entrySet();
        entries1.forEach(s-> System.out.println(s));

    }
}
