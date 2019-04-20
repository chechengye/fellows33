public class Test_02 {
    public static void main(String[] args) {

        Integer i = new Integer(10);
        Integer i1 = new Integer(10);
        System.out.println(i1 == i);
        Integer i4 = new Integer(128);
        Integer i5 = new Integer(128);
        System.out.println(i4 == i5);

        Integer i2 = 10;
        Integer i3 = 10;
        System.out.println(i2 == i3);

        Integer i6 = 127;
        Integer i7 = 127;
        System.out.println(i6 == i7);

        //享元模式 1byte空间 ， -128~127

        System.out.println(Integer.MAX_VALUE);
        try{
            int a = Integer.parseInt("ad1");
        }catch (NumberFormatException e){
            System.out.println("数字格式化异常！");
        }
        int a1 = Integer.valueOf("234");
        System.out.println(a1);
    }
}
