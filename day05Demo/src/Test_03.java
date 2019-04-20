public class Test_03 {

    public static void main(String[] args) {
        try{
            System.out.println(div(10 , 0));
        }catch (ArithmeticException eeee){
            System.out.println("sssd");
            eeee.printStackTrace();
        }

    }

    public static int div(int a , int b) {

        int c = a / b;
        System.out.println(c);
        throw new ArithmeticException();
    }

}
