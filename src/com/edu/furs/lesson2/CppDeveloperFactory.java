package com.edu.furs.lesson2;


public class CppDeveloperFactory implements IDeveloperFactory {


    @Override
    public IDeveloper createDeveloper() {
        return new CppDeveloper();
    }
}
