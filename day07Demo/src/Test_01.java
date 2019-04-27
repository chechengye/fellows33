import java.util.*;

public class Test_01 {

    public static void main(String[] args) {
        /*Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat(1 , "xh");
        Cat cat2 = new Cat(2 , "wx");
        Cat cat3 = new Cat(3 , "cs");
        Cat cat4 = new Cat(1 , "xh");
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        Cat[] cats = set.toArray(new Cat[]{});
        for(Cat c : cats){
            System.out.println(c);
            System.out.println(c.hashCode());
        }*/
        treeSet();

    }

    public static void treeSet(){
        Set<String> set = new LinkedHashSet<>();
       /* Cat cat2 = new Cat(2 , "wx");
        Cat cat1 = new Cat(1 , "xh");
        Cat cat3 = new Cat(3 , "cs");
        Cat cat4 = new Cat(1 , "xh");
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);*/
       set.add("tom");
        set.add("lily");
        set.add("ab");
        set.add("ab");
        set.add("lucy");
        set.add("jack");
        String[] ss = set.toArray(new String[]{});
        for(String s : ss){
            System.out.println(s);
        }
    }
}

class Cat{
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }*/

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
