package com.weichuang.zhengze;

public class Test_01 {
    public static void main(String[] args) {
        /**
         * 1、验证电话号码（如：010-38389438 ）
         * 2、验证手机号码
         * 3、验证用户名，只能是字母开头的，数字、字母或下划线的组合
         * 4、验证邮箱(如:zhangsan_wc@163.com)
         * 5、验证年龄（100以内）
         * 6、验证金额（可以有小数位）
         */
        String s = "zhangsan_wc@163.com";
        //1、验证电话号码（如：010-38389438 ）
        //boolean matches = s.matches("\\d{3,4}-\\d{8,9}");
        //2、验证手机号码
        //boolean matches = s.matches("1[\\d&&[^126]]\\d{9}");
        //3、验证用户名，只能是字母开头的，数字、字母或下划线的组合
        //boolean matches = s.matches("[a-zA-Z]\\w*");
        //4、验证邮箱(如:zhangsan_wc@163.com)
        boolean matches = s.matches("[a-zA-Z0-9]+\\w*@[a-zA-Z0-9]+[.][a-zA-Z]+");
        System.out.println(matches);

    }
}
