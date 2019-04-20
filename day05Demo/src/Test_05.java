public class Test_05 {
    public static void main(String[] args) {
        String s1 = "飞飞";
        s1 = "飞飞2";
        String s2 = "飞飞";
        System.out.println(s1 == s2);

        String s3 = new String("飞飞");
        String s4 = new String("飞飞");
        System.out.println(s3 == s4);

       /* final String a = "a";
        String a1 = a+1;
        String a2 = "a1";
        System.out.println(a1 == a2);*/

        /*final String b = getStr();
        String b1 = b + 1;
        String b2 = "a1";
        System.out.println(b1 == b2);*/


    }

    public static String getStr(){
        return "a";
    }
}
