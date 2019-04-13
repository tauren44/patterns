package com.mateacademy.abstractfactory;

public class DefaultKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("printing with default keyboard");
    }

    @Override
    public void println() {
        System.out.println("default keyboard with end line");
    }
}
