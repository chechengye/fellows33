import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test_02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(50);
        list.add("tom");
        list.add("lily");
        list.add("lucy");
        list.add("abm");
        iterator(list);
    }

    public static void iterator(Collection<String> c){
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
