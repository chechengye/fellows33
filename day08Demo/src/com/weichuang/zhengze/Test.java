package com.weichuang.zhengze;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String s = "5201314";
  /*      String s1 = "aaaaaaaaaaec";
        Pattern p = Pattern.compile("a{2,}[a-z&&[def]]c");
        Matcher m = p.matcher(s1);
        boolean b = m.matches();
        System.out.println(b);*/

        //String[] split = s.split("[1]");
        /*String s2 = s.replaceFirst("1" , "*");
        //System.out.println(Arrays.toString(split));
        System.out.println(s2);*/
        boolean matches = s.matches("\\d+");
        System.out.println(matches);


       /* char[] chars = s.toCharArray();
        boolean flag = true;
        for(int i = 0 ; i<chars.length ; i++){
            if(chars[i] < '0' || chars[i] > '9'){
                flag = false;
            }
        }
        System.out.println(flag);*/
    }
}
