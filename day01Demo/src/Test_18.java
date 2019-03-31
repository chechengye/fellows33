/*
 *Java阶乘求和 1!+2!+...+10!
 */

public class Test_18 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            int num = 1;
            int j = i;
            do {
                num *= j;
                j--;
            }while (j > 0);
            i++;
            sum += num;
        }while (i <=10);
        System.out.println(sum);
    }
}
