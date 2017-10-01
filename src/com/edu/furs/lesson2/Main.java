package com.edu.furs.lesson2;


public class Main {

    public static void main(String[] args) {
        IDeveloperFactory developerFactory = createConcreteDeveloper("php");
        IDeveloper developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static IDeveloperFactory createConcreteDeveloper(String spec) {
        if(spec.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if(spec.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
        } else if(spec.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        }
        else throw new RuntimeException(spec + " is unknown!");
    }
}
