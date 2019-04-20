import java.util.Arrays;

public class Test_06 {

    public static void main(String[] args) {
        String str = "aghdd1,2skyhd234,3sd54jh";

      /*  System.out.println(str.charAt(2));
        char[] cs = str.toCharArray();
        System.out.println(Arrays.toString(cs));

        char[] css = {'1' , '2' , '3'};
        String ss = new String(css , 0 ,2 );
        System.out.println(ss);

        System.out.println(str.startsWith("gh" , 1));

        //System.out.println(str.replace("dd" , "*"));
        System.out.println(str.substring(2 , 6));*/
        //System.out.println(Arrays.toString(str.split(","  , 3)));

        //System.out.println(str.replaceAll("\\d" , "*"));
       /* System.out.println(str.contains("yhd"));
        if(str.indexOf("yh") != -1){
            System.out.println("包含");
        }*/
       String str2 = null;
        //System.out.println(str2.isEmpty());
        if(null != str2 && !str2.isEmpty()){
            System.out.println(str2);
        }
        int[] ii = {1,2};
        System.out.println(ii.length);
        System.out.println(str.length());
        String str4 = "   ds   dsd   ";

        /*System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());*/
 /*       System.out.println(str4.trim());
        String s = "";
        s = s + "abs";
        s = s + "123";
        System.out.println(s);
        StringBuffer sb = new StringBuffer(30);
        sb.append("abs").append("12fsdfdsfsfdsfdsdf434343sdfsdsf3");
        System.out.println(sb.toString());*/
        StringBuffer sb = new StringBuffer(30);
        sb.append("abs").append("12fsdfdsfsfdsfdsdf434343sdfsdsf3");
        sb.delete(0 , 5);
        sb.insert(6 , "****");

        sb.reverse();

        System.out.println(sb.toString());

        StringBuffer sb2 = new StringBuffer(new CharSequence() {
            @Override
            public int length() {
                return 0;
            }

            @Override
            public char charAt(int index) {
                return 0;
            }

            @Override
            public CharSequence subSequence(int start, int end) {
                return null;
            }
        });
        System.out.println(sb2.toString());

    }
}
