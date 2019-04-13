public class Test_08 {

    public static void main(String[] args) {
        //System.out.println(args.length);
        Cat cat = new Cat();

    }


}

class Cat{

    public Cat(){
        System.out.println("构造代码块！");
    }
    static {
        System.out.println("静态代码块！");
    }

    {
        System.out.println("构造快");
    }
    public void eat(){
        System.out.println("普通代码块！");
    }

}
