public class Test_01 {
    public static void main(String[] args) {
        HomeDog homeDog = new HomeDog();
        System.out.println(homeDog.name);
        homeDog.eat();
    }
}

class Dog{
    protected int age;
    protected String name;

    public Dog(){}


    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }


    private void eat(){
        System.out.println(this.name + "吃...");
    }
}

class Person extends HomeDog{

}
class HomeDog extends Dog{

    public HomeDog(){
        super(10 , "test");
    }

    public void eat() {
        //super.eat();
        //System.out.println(super.name);

    }
}