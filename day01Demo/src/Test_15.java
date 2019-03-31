/**
 * 计算10的阶乘
 */
public class Test_15 {
    public static void main(String[] args) {
        int num = 1;
        int i = 1;
        while ( i <= 10){
            num *= i;
            i ++;
        }
        System.out.println(num);
    }
}
