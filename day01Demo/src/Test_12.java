import java.util.Scanner;

/**
 * 2、输入一个月数，然后输出对应月份有多少天（不考虑闰年），将天数输出。
 */
public class Test_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m){
       /*     case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("有31天");
                break;*/
            case 2:
                System.out.println("28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("有30天");
                break;
            default:
                System.out.println("有31天");
        }
    }
}
