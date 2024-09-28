package org.example.design_pattern.creational.singleton;

public class SingleObject {


    /* this field should be static and initialized
     * in this class
     */
    private static SingleObject instance = new SingleObject();

    /* constructor
     * must be private
     */
    private SingleObject() {
    }

    ;

    /*because this class
     * has a private constructor
     * there will be only one object
     */
    public static SingleObject getInstance() {
        return instance;
    }

    public String sayHello(String message) {
        return "Hello " + message;
    }

}
