package com.edu.furs.lesson2;


public class PhpDeveloperFactory implements IDeveloperFactory {


    @Override
    public IDeveloper createDeveloper() {
        return new PhpDeveloper();
    }
}
