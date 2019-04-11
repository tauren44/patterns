package com.mateacademy.abstractfactory;

public class DefaultMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("10 ms response");
    }

    @Override
    public void scroll() {
        System.out.println("bad scroll");
    }
}
