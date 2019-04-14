public class Test_06 {

    public static void main(String[] args) {
        AnimalDemo b = new Bird();
        AnimalDemo p = new Pig();

        //向上转型
        Pig pp = new Pig();
        p = (AnimalDemo)pp;

        //向下转型
        pp = (Pig)p;
        function(p);
        function(b);

    }

    public static void function(AnimalDemo a){

        if(a instanceof Pig){
            ((Pig) a).sleep();
        }else if(a instanceof  Bird){
            ((Bird) a).fly();
            a.eat();
        }
    }
}

abstract class AnimalDemo{
    public abstract void eat();
}

class Bird extends AnimalDemo{

    @Override
    public void eat() {
        System.out.println("吃虫子！");
    }
    public void fly(){
        System.out.println("飞...");
    }

}
class Pig extends AnimalDemo{

    @Override
    public void eat() {

    }

    public void sleep(){
        System.out.println("爱睡觉！");
    }
}
