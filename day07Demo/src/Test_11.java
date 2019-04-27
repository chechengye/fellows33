import com.weichuang.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test_11 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Class<? extends Dog> dogClass = dog.getClass();
        Class dogClass1 = Dog.class;
        try {
            Class aClass = Class.forName("com.weichuang.Dog");
           /* System.out.println(aClass.getPackage());
            System.out.println(aClass.getName());*/
            Field[] fields = aClass.getDeclaredFields();
            for(int i = 0 ; i< fields.length ; i++){
                System.out.println(fields[i]);
            }


            Method[] methods = aClass.getMethods();
            /*for(int i = 0 ; i< methods.length ; i++){
                System.out.println(methods[i]);
            }*/
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Dog d = dogClass.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Constructor<?>[] constructors = dogClass.getConstructors();
        for (int i = 0 ; i< constructors.length ; i++){
            for(int j = 0 ; j < constructors[i].getParameterTypes().length ; j++){

                System.out.println(constructors[i].getParameterTypes()[j]);
            }
        }

    }
}
