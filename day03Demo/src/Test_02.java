import java.util.Arrays;

public class Test_02 {

    public static void main(String[] args) {
        int[] a = {22,11,5,66,2};
        a = Arrays.copyOf(a , a.length +1);

        Arrays.fill(a , 1 , 2 , 44);
        //Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //System.out.println(a.length);
        //System.out.println(Arrays.binarySearch(a , 2));
    }
}
