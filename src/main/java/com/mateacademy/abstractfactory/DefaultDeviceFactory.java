package com.mateacademy.abstractfactory;

public class DefaultDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new DefaultMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new DefaultKeyboard();
    }
}
