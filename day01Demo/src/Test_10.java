import java.util.Scanner;

/**
 * 给出一个百分制成绩，要求输出成绩等级
 * ‘A’、‘B’、‘C’、‘D’、‘E’。
 * 90分以上输出’A’，80～89分输出’B’，70～79分输出’C’，
 * 60～69分输出’D’，60分以下输出‘E’。
 */

public class Test_10 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int result = sc.nextInt();
        if(result >= 90){
            System.out.println("A");
        }else if(result >= 80 && result < 90){
            System.out.println("B");
        }else if(result >= 70 && result < 80){
            System.out.println("C");
        }else{
            System.out.println("E");
        }

        if(true){
            if(true){

            }else {

            }
        }
    }
}
