public class Test_05 {
    public static void main(String[] args) {
        /*int x = 10;
        method(x);
        System.out.println(x);*/
        /*Dog_t dogT = new Dog_t();
        dogT.x = 10;
        method(dogT);*/
        String name = "小飞";
        method(name);
        System.out.println(name);
    }
    public static void method(String name){
        name = "小贝";
    }
}

class Dog_t{
    int x = 20;
}
