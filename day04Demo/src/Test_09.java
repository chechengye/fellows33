/**
 * 简单工厂模式
 */
public class Test_09 {

    public static void main(String[] args) {
        /*Product p = new Mobile();
        p.work();*/
        FactoryProduct fp = new FactoryProduct();
        Product p = fp.getProduct("computer");
        p.work();
    }
}

class FactoryProduct{

    public Product getProduct(String name){
        if(name.equals("mobile")){
            return new Mobile();
        }else if(name.equals("computer")){
            return new Computer();
        }
        return null;
    }

}

abstract class Product{
    public abstract void work();
}

class Mobile extends Product{

    @Override
    public void work() {
        System.out.println("生产手机....");
    }
}

class Computer extends Product{

    @Override
    public void work() {
        System.out.println("生产电脑....");
    }
}