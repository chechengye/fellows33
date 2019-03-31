import java.util.Scanner;

/**
 * 猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数。
 */

public class Test_03 {

    public static void main(String[] args) {
        int[] a = {11,23,55,66};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean flag = false;
        for (int b : a) {
            if(x == b){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
