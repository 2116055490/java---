package com.company.Demo;

public class MyInterfaceImpl implements MyInterface<String>{
    @Override
    public String server(String t) {
        return t;
    }
}
