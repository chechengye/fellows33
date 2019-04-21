import java.util.Arrays;

public class Test_02 {

    public static void main(String[] args) {
        int[] a = {51,10,9,66,88};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        String[] s = {"jhds","扫码","gtt","测试","mhhh"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        Dog[] dogs = {new Dog(5, "xh") , new Dog(3 , "wd") ,new Dog(3 , "fd"), new Dog(8 , "cs")};
        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));

        Cat[] cats = {new Cat(5, "xh") , new Cat(3 , "wd") ,new Cat(3 , "fd"), new Cat(8 , "cs")};
        Arrays.sort(cats , new CatComparator());
        System.out.println(Arrays.toString(cats));

    }
}
class Dog implements Comparable<Dog>{
    private int age;
    private String name;

    public Dog(){}
    public Dog(int age, String name) {
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

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog o) {

        /*if(o instanceof Dog){
           *//* if(this.age > ((Dog) o).age ){
                return 3;
            }else if(this.age < ((Dog) o).age ){
                return -1;
            }*//*
            return this.age - ((Dog) o).age ;
        }*/
        return this.age - o.age;

    }
}