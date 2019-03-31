import java.util.Arrays;

public class Test_02 {

    public static void main(String[] args) {
       /*

        for(int i = 0 ; i < no.length ; i++){
            System.out.println(no[i]);
        }*/
       /*int[] no = new int[3];
       no[0] = 1001;*/
       //int[] no = new int[]{1001,1002,1003,1004};
       /*int[] no1 = {1001 , 11 , 1003,111};
        for(int i = 0 ; i < no1.length ; i++){
            System.out.println(no1[i]);
        }

        for (int x : no1) {
            System.out.println(x);
        }*/
       printInfo(1,2,3,4,5);
       //System.out.println(no1.length);
       //System.out.println(no1[no1.length]);

        /*int[] a = null;
        a.length;*/

    }

    public static void printInfo(int a , int... b){
        System.out.println(Arrays.toString(b));
    }

}
