import java.util.*;

public class Test_10 {

    public static void main(String[] args) {
        Map<Student2 , String> map = new HashMap<>();
        map.put(new Student2(1 , "zs") , "哈尔滨");
        map.put(new Student2(2 , "lisi") , "哈尔滨");
        map.put(new Student2(1 , "zs") , "哈尔滨");
        map.put(new Student2(3 , "lisi") , "哈尔滨");

        Set<Map.Entry<Student2, String>> entries = map.entrySet();
        Iterator<Map.Entry<Student2, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
class Student2{
    private int age;
    private String name;

    public Student2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age &&
                Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
