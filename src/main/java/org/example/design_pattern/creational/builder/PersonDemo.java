package org.example.design_pattern.creational.builder;

public class PersonDemo {

    public static void main(String[] args){
        Person.PersonBuilder personBuilder = new Person.PersonBuilder("javad","John");

        Person person = personBuilder
                .setAge(12)
                .build();

        System.out.println(person);
    }
}
