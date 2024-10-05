package org.example.design_pattern.creational.prototype;

public class SalaryPersonCache {

    //this class will save its configurations in memory
    private static SalaryProcess processor;

    static {
        processor = new SalaryProcess();
    }

    public static SalaryProcess getProcessor() {
        //with using clone method we will have on initialization and different objects ,this will reduce cost of operation
        return processor.clone();
    }
}
