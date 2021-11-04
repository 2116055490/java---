package com.company.Demo;

public class MyGeneric<T>{
    // 使用泛型T
    // 1.创建变量
    T t;

    // 2.泛型作为方法参数  不能实例化
    public void show(T t){
        System.out.println(t);
    }

    // 3.泛型作为方法的返回值
    public T getT(){
        return t;
    }
}
