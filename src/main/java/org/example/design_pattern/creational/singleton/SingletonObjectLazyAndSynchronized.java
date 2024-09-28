package org.example.design_pattern.creational.singleton;

public class SingletonObjectLazyAndSynchronized {

    /* this field should be static and initialized
     * in this class, and we make it lazy because
     * when we don't need this class
     * there is no reason to be an object
     * of this class and for this approach we must
     * remove new key word from field and
     * implement it in the get instance method
     */
    private static SingletonObjectLazyAndSynchronized instance;

    /* constructor
     * must be private
     */
    private SingletonObjectLazyAndSynchronized() {
    }

    ;

    /*because this class
     * has a private constructor
     * there will be only one object
     * and easiest way to
     * thread safe but not recommended
     */
    public static synchronized SingletonObjectLazyAndSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonObjectLazyAndSynchronized();
        }
        return instance;
    }

    /*because this class
     * has a private constructor
     * there will be only one object
     * and easiest way to
     * thread safe
     * the name of this pattern is
     * double check login
     * and will prevent performance
     * issues because
     *
     * ==> we have always an
     * overhead in past approach
     * and will make performance
     * issues
     *
     * ==> TODO ==> the best way to prevent this is
     * double check login
     */
    public static synchronized SingletonObjectLazyAndSynchronized getInstanceThreadSafe() {
        synchronized (SingletonObjectLazyAndSynchronized.class) {
            if (instance == null) {
                instance = new SingletonObjectLazyAndSynchronized();
            }
        }
        return instance;
    }


    public String sayHello(String message) {
        return "Hello " + message;
    }
}
