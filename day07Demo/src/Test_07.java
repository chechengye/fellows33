import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_07 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        Queue q = new LinkedList(list);
        q.add("aa");
        q.add("bb");
        q.add("cc");
        q.add("dd");
        //q.poll();
        System.out.println(q.peek());
        q.forEach(s-> System.out.println(s));
    }
}
