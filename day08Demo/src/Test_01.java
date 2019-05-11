
import com.weichuang.Dog;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_01 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Class<? extends Dog> dogClass = dog.getClass();
        Class dogClass1 = Dog.class;
        try {
            Class aClass = Class.forName("com.weichuang.Dog");
           /* System.out.println(aClass.getPackage());
            System.out.println(aClass.getName());*/
         /*   Field[] fields = aClass.getDeclaredFields();
            for(int i = 0 ; i< fields.length ; i++){
                System.out.println(fields[i]);
            }
*/

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

       /* Constructor<?>[] constructors = dogClass.getConstructors();
        for (int i = 0 ; i< constructors.length ; i++){
            for(int j = 0 ; j < constructors[i].getParameterTypes().length ; j++){

                System.out.println(constructors[i].getParameterTypes()[j]);
            }
        }*/
       /* try {
            Constructor<? extends Dog> constructor = dogClass.getConstructor(int.class, String.class);
            System.out.println(constructor.getParameterCount());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/
        Dog dog1 = new Dog(1 , "xh");

        Method[] declaredMethods = dogClass.getDeclaredMethods();
        for(int i = 0 ; i < declaredMethods.length ; i++){
            System.out.println(declaredMethods[i].getName());

            if(declaredMethods[i].getName().equals("setWeight")){
                try {
                    declaredMethods[i].setAccessible(true); //去掉修饰符,或者叫属性公有化
                    String s = (String) declaredMethods[i].invoke(dog1 , "100");
                    System.out.println(s);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
