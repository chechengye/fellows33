package com.weichuang.meiju;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

    public enum ColorEnum{
        RED(1 , "红色") , GREEN , BLUE;
        private ColorEnum(){

        }
        private ColorEnum(int age , String name){
            this.age = age;
            this.name = name;
        }
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        ColorEnum c = ColorEnum.RED;
        switch (c){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
        //System.out.println(ColorEnum.GREEN.getName());

        EnumMap<ColorEnum , String> map = new EnumMap<>(ColorEnum.class);
        map.put(ColorEnum.RED  , "红色");
        map.put(ColorEnum.BLUE  , "蓝色");
        map.put(ColorEnum.GREEN  , "绿色");
        map.forEach((s , v)-> System.out.println(v));
        Set<Map.Entry<ColorEnum, String>> entries = map.entrySet();
        entries.forEach(w-> System.out.println(w.getValue()));
        /*Iterator<Map.Entry<ColorEnum, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

    }
}
interface Constants{
    public static final int COO_I = 404;
    public static final int COO_U = 501;
    public static final int COO_C = 200;
    public static final int COO_Q = 103;
}

