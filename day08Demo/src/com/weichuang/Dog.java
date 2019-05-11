package com.weichuang;

public class Dog {
    private int age;
    private String name;
    public String weight;

    private void setWeight(String weight){
        this.weight = weight;
        System.out.println(this.weight);
    }
    public Dog(){

    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}