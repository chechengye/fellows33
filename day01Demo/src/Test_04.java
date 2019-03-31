import java.util.Scanner;

/**
 * 根据天数（46）计算周数和剩余的天数，天数是通过键盘输入
 */
public class Test_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = x / 7 ;
        int d = x % 7 ;
        System.out.println("周数:" + z + "天数:" +d);
    }
}
