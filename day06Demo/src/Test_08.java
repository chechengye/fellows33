public class Test_08 {
    public static void main(String[] args) {
        IEat eat = new IEat() {
            @Override
            public int eat(final String name , int age) {
                System.out.println(name + "eat...apple" + age);
                return age;
            }
        };
        eat.eat("zs" ,2);
        IEat eat2 = ( n ,  a) -> a;
        System.out.println(eat2.eat("ls", 5));
        IEat.drink();
    }
}
@FunctionalInterface
interface IEat{
    int eat(final String name , int age);
    default void move(){

    }
    static void drink(){
        System.out.println("drink");
    }
}