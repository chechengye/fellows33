package Generic;

import com.weichuang.proxy.Person;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Node<String> n = new Node<String>("dsd");
        System.out.println(n.getData());
        Node<Number> n1 = new Node<>(100);
        Node<Integer> n2 = new Node<>(200);

        //n1 = n2;
        getData(n1);
       // getData(n2);
        printInfo(1,"2220" , new Person());
        String[] arrs = {"123" , "456","765"};
        System.out.println(Arrays.toString(getList(arrs, 0, 2)));


    }

    public static Node getData(Node<? super Number> node){
        return node;
    }

    public static <T> void printInfo(T... a){
        for(int i = 0; i < a.length ; i++){
            System.out.println(a[i]);
        }
    }

    public static <T> T[] getList(T[] list, int i , int j){

        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }

}
