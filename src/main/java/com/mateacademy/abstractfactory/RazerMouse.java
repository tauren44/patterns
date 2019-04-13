package com.mateacademy.abstractfactory;

public class RazerMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("1ms response");
    }

    @Override
    public void scroll() {
        System.out.println("good scroll");
    }
}
