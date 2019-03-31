import java.util.Arrays;

public class Test_06 {

    public static void main(String[] args) {

        int[] a = {33 ,55 ,45 ,23 ,11};
        for(int i = 0 ; i< a.length - 1 ; i++){
            for(int j = i + 1 ; j < a.length ; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        //33 55 45 23 11
        //11 55 45 33 23 //第一轮 结束
        //11 23 55 45 33 //第二轮结束
        //11 23 33 55 45 //第三轮结束
        // 11 23 33 45 55 //第四轮结束


    }
}
