package com.alibou.exeption;

class A{

}

class B extends A{
    String name;

    public B(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
        A b = new B("samn");
        System.out.println(((B)b).getName());
    }
}
