public class Test_05 {
    public static void main(String[] args) {
        PersonDemo p = new PersonDemo() {
            @Override
            public void move() {

            }
        };
        p.eat();
    }
}

abstract class PersonDemo implements DemoInterface , Demo01Interface{

    @Override
    public void eat() {
        System.out.println("吃饭!");
    }
}
/*class CatDemo implements DemoInterface , Demo02Interface ,Demo01Interface{

    @Override
    public void eat() {
        System.out.println("吃鱼!");
    }


}*/

interface DemoInterface extends Demo01Interface {

    //public abstract void eat();
    void eat();
    //public final int COUNT = 10;
    //int COUNT = 10;
}

interface Demo01Interface{
 /*   private
    private int count = 0;*/

    /*default void eat(){
        System.out.println("eat,,,,");
    }
    */
    void move();
}

interface Demo02Interface{
    void drink();
}