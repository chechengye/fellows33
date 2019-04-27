import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
       /* list.add("bb");
        list.add("aa");
        list.add("cc");
        list.add("aa");
        list.add("dd");*/
       Collections.addAll(list , "aa" , "bb" ,"cc");
        //Collections.reverse(list);
        //Collections.sort(list);
        //Collections.swap(list , 3 , 1);
        //Collections.rotate(list , 2);
        //System.out.println(Collections.frequency(list, "aa"));
        Collections.replaceAll(list , "aa" , "ii");
        list.forEach(s-> System.out.println(s));
    }
}
