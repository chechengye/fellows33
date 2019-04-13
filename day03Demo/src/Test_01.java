import java.util.Arrays;

/**
 * 选择排序算法
 */
public class Test_01 {
    public static void main(String[] args) {
        int[] a = {14,33,22,5,7 };
        for(int i = 0 ; i< a.length ; i++){
            int minIndex = i;
            for(int j = i +1 ; j < a.length ; j++){
                if(a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(a));

    }

    // 14 33 22 5 7  // i=0  minIndex = 0;
    // 5 33 22 14 7    第一轮结束minIndex = 3
    // 5 7 22 14 33      第二轮结束         i = 1 minIndex = 4
    // 5 7 14 22 33      第三轮   i =  2 minIndex = 3
    //5 7 14 22 33     第四轮   i =  3 minIndex = 3
}
