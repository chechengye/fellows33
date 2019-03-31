/**
 * 最小值：
 * 在一个数列中找出最小的数
 */
public class Test_05 {

    public static void main(String[] args) {
        int[] a = {11,44,-1,33,55,7};
        int min = Integer.MAX_VALUE;
        for(int x : a){
            if(min > x){
                min = x;
            }
        }
        System.out.println(min);
    }
}
