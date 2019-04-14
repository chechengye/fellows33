public class Test_03 {
    public static void main(String[] args) {
        //System.out.println(Tools.POWER_LEVEL);
        Man man = new Man();
        man.eat(20);
    }
}
class Tools{

    public static final int POWER_LEVEL = 10;
}

class Person_1{
    public final void eat(final int age){

        System.out.println(age +"吃....");
    }
}
class Man extends  Person_1{
}