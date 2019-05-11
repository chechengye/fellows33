import com.weichuang.proxy.Person;

import java.util.ArrayList;
import java.util.List;

public class Test_03 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person());

        for(int i = 0 ; i < list.size() ; i++){

            Person p = (Person)list.get(i);
            p.fly();

        }
    }
}
