package org.example.design_pattern.creational.prototype;

public class PrototypeDemo {

//    public static void main(String[] args) {
//        SalaryProcess person1 = new SalaryProcess("Person 1");
//        person1.salaryCalculation();
//        SalaryProcess person2 = new SalaryProcess("Person 2");
//        person2.salaryCalculation();
//
//
//        System.out.println(person1);
//        System.out.println(person2);
//    }
//


    //using cache class and cloneable interface
    public static void main(String[] args) {

    SalaryProcess process1 = SalaryPersonCache.getProcessor();
    process1.setPersonName("milad");
    process1.salaryCalculation();


    SalaryProcess process2 = SalaryPersonCache.getProcessor();
    process2.setPersonName("milad2");
    process2.salaryCalculation();


        System.out.println(process1);
        System.out.println(process2);
    }
}
