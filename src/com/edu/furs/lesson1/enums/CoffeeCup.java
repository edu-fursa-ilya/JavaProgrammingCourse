package com.edu.furs.lesson1.enums;

enum CoffeeCup {SMALL(100), MEDIUM(200), BIG(500) {
    public int getCupSize() {
        return 900;
    }
};
    private int cupSize;
    CoffeeCup(int size) {
        this.cupSize = size;
    }

    public int getCupSize() {
        return cupSize;
    }
}