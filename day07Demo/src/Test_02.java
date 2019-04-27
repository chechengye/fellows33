import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test_02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(50);
        //Vector<String> list = new Vector<>(50);
        list.add("tom");
        list.add("lily");
        list.add("lucy");
        list.add("abm");
        //iterator(list);
        //enumeration(list);
        //foreach(list);

        //System.out.println(testFunction("abc", (s) -> s.toUpperCase()));
     /*   Supplier<String[]> s = new Supplier<String[]>() {
            @Override
            public String[] get() {
                return new String[0];
            }
        };*/
        String[] strings = testSupplier(10, () -> {
            String[] ss = new String[10];
            for (int i = 0; i < ss.length; i++) {
                ss[i] = (Math.random() * 100) + "";
            }
            return ss;
        });
        for(String s : strings){
            System.out.println(s);
        }

    }

    private static String[] testSupplier(int num , Supplier<String[]> s){
        for(int i = 0 ; i< num ; i++){
            return s.get();
        }
        return null;
    }

    private static String testFunction(String val , Function<String , String> f){
        return f.apply(val);
    }

    private static void foreach(Collection<String> c){
        /*for(String s : c){
            System.out.println(s);
        }*/
        MyConsumer tConsumer = s -> System.out.println(s);

        c.forEach(tConsumer);
        //c.forEach(System.out::println);


    }

    public static void enumeration(Vector<String> v){
        Enumeration<String> elements = v.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }

    public static void iterator(Collection<String> c){
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
interface MyConsumer extends Consumer<String>{

}
