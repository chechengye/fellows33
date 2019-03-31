/**
 * 打印输出0~200之间能被7整除但不能被4整除的所有整数；
 */

public class Test_19 {

    public static void main(String[] args) {
        /*int i = 0;
        for(;  ;){

            if(i == 5)
                break;
                //continue;
            i++;
            System.out.println(i);
        }*/
        for(int i = 1 ; i < 200 ; i++){
            if(i % 7 == 0 && i % 4 != 0 ){
                System.out.println(i);
            }
        }

    }
}
