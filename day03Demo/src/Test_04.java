public class Test_04 {
    public static void main(String[] args) {
        Dog dog = new Dog(3 , "小红");
       /* dog.setName("小黑");
        dog.setAge(3);*/
        dog.test();

        /*Dog dog1 = null;
        dog1.eat();*/
        Dog[] dogs = new Dog[6];
        dogs[0] = dog;

    }
}

class Dog{
    private int age;
    //String name = "小黄";
    private String name;

    public Dog(){

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age , String name){
        this("测试");
        this.age = age;
        this.name = name;
    }

    public void eat(){
        int age = 1;
        System.out.println(this.name + "吃...." + age);
    }

    public void test(){
        this.eat();
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
}