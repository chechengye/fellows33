import java.util.*;

public class Test_11 {

    public static void main(String[] args) {
        //vector();
        //linkList();
        set();
    }

    public static void set(){
        Set<String> set = new HashSet<>();
        set.add("bom");
        set.add("aom");
        set.add("tom");
        set.add("lily");
        set.add(null);
        set.add(null);
        set.add("lily");
        set.add("lucy");
        set.remove("tom");

        String[] names = set.toArray(new String[] {});
        for(String s : names){
            System.out.println(s);
        }
    }

    public static void linkList(){
        List<String> list = new LinkedList<>();
        list.add("tom");
        list.add("lily");
        list.add(null);
        list.add("lily");
        list.add("lucy");
        for(String s : list){
            System.out.println(s);
        }
    }

    public static void vector(){
        List<String> list = new Vector<>();
        list.add("tom");
        list.add("lily");
        list.add("lucy");
        for(String s : list){
            System.out.println(s);
        }
    }
}
