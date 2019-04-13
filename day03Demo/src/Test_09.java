/**
 * 单例设计模式
 * 、构造方法私有化
 * 2、声明一个本类对象
 * 3、给外部提供一个静态方法获取对象实例
 */
public class Test_09 {
    public static void main(String[] args) {
        SingleTon1 s = SingleTon1.getSingleTon();
        SingleTon1 s1 = SingleTon1.getSingleTon();
        System.out.println(s == s1);
    }
}

/**
 * 饿汉式
 */
class SingleTon{
    private SingleTon(){}
    private static SingleTon singleTon = new SingleTon();

    public static SingleTon getSingleTon() {
        return singleTon;
    }
}

/**
 * 懒汉式
 */
class SingleTon1{
    private SingleTon1(){}
    private static SingleTon1 singleTon = null;

    public static SingleTon1 getSingleTon() {
        if(null == singleTon){
            singleTon = new SingleTon1();
        }
        return singleTon;
    }
}


