package com.mateacademy.abstractfactory;

public class RazerKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("loud printing but good response");
    }

    @Override
    public void println() {
        System.out.println("printing line on razer");
    }
}
