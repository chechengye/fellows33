public class Test_04 {

    public static void main(String[] args) {
        //Animal animal = new Animal();
    }
}
abstract class Animal{ //抽象类不能定义为final ，同时也不能被实例化


    private String name;
    //抽象类可以有构造方法
    public Animal(){

    }
    public void drink(){

    }



}
class Cat extends Animal{

    public void eat(String name) {

    }

    public void move(String name) {

    }


}