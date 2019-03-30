/**
 * 2、定义一个五位整数，求各个位上的数的和。
 */
public class Test_03 {

    public static void main(String[] args) {
        int a = 54321;
        int w = a / 10000;
        int q = a / 1000 % 10 ;
        int b = a / 100 % 10 ;
        int s = a / 10 % 10;
        int g = a % 10;


        System.out.println("和: " + (w + q + b + s + g));
    }
}
