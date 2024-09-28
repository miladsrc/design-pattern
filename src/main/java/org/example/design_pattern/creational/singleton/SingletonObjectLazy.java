package org.example.design_pattern.creational.singleton;

public class SingletonObjectLazy {

    /* this field should be static and initialized
     * in this class, and we make it lazy because
     * when we don't need this class
     * there is no reason to be an object
     * of this class and for this approach we must
     * remove new key word from field and
     * implement it in the get instance method
     */
    private static SingletonObjectLazy instance;

    /* constructor
     * must be private
     */
    private SingletonObjectLazy() {
    }

    ;

    /*because this class
     * has a private constructor
     * there will be only one object
     */
    public static SingletonObjectLazy getInstance() {
        if (instance == null) {
            instance = new SingletonObjectLazy();
        }
        return instance;
    }

    public String sayHello(String message) {
        return "Hello " + message;
    }

}


