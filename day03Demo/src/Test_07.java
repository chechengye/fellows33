public class Test_07 {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person();
        Person p2 = new Person();
        //Person.eat();

        Person.Inner.eat();
        //eat();
        //this.eat(); //不用引用this super

    }
    public void eat(){
    }
}
class Person{
    public static int count = 0;
    public Person(){
        count++;
    }

    public void eat(){
    }
    static class Inner{
        public static void eat(){
            System.out.println("内部类!");
        }
    }
}
