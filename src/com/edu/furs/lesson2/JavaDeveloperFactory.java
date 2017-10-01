package com.edu.furs.lesson2;


public class JavaDeveloperFactory implements IDeveloperFactory {

    @Override
    public IDeveloper createDeveloper() {
        return new JavaDeveloper();
    }
}
