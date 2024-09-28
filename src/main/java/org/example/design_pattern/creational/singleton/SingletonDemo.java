package org.example.design_pattern.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        /* first approach implementation of
            singleton design pattern
            which is not lazy and thread safe
         */
        SingleObject singleObject = SingleObject.getInstance();
        System.out.println(singleObject.sayHello("milad"));

    }
}
