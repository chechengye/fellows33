public class Test_24 {
    /**
     *      A
     *     BBB
     *    CCCCC
     *   DDDDDDD
     *  EEEEEEEEE
     */
    public static void main(String[] args) {
        char a = 'A';
        for(int i = 1 ; i<=8 ; i++){
            for(int j = 8 ; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1 ; k <= 2*i - 1 ; k++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
