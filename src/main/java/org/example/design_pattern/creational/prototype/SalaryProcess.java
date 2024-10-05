package org.example.design_pattern.creational.prototype;

import java.util.Random;

public class SalaryProcess implements Cloneable{

    private String formula;
    private String personName;
    private float salary = 0;

    public SalaryProcess()  {
        //load all setting

        System.out.println("logging the initializing ...");
        try{
            Thread.sleep(500);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        formula = "Loaded formula";
//        this.personName = PersonName;
    }

    public void salaryCalculation(){
        Random random = new Random();
        salary = random.nextFloat();
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "SalaryProcess{" +
                "formula='" + formula + '\'' +
                ", personName='" + personName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public SalaryProcess clone() {
        Object clone = null;
        try {
            clone = super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (SalaryProcess) clone;
    }
}
