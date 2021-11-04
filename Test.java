package com.company.Demo;

public class Test {
    public static void main(String[] args) {
        // 使用泛型创建对象
        MyGeneric<String> stringMyGeneric = new MyGeneric<>();
        stringMyGeneric.t="你好";
        stringMyGeneric.show("大家好");
        String t = stringMyGeneric.getT();
        MyGeneric<Integer> integerMyGeneric = new MyGeneric<>();
        integerMyGeneric.t=100;
        integerMyGeneric.show(200);
        Integer t1 = integerMyGeneric.getT();
        System.out.println(t1+t);


    }
}
