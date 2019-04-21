import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Test_09 {

    public static void main(String[] args) {

        List c = new ArrayList();
        arrayList();
    }

    public static void arrayList(){
        List<String> list = new ArrayList<>();//多态
        list.add("tom");
        list.add("lucy");
        list.add("lily");
        list.add("jack");
        list.add("100");
        list.add("jack");

        list.add(2 , "wudi");

        //System.out.println(list.get(2));
        //list.remove(2);
        //list.remove("lily");
        /*for (String s:list) {
            System.out.println(s);
        }*/
       for(int i = 0 ; i< list.size() ; i++){
            System.out.println(list.get(i));
           // System.out.println(Integer.valueOf((String)list.get(i)));
        }
    }
}
