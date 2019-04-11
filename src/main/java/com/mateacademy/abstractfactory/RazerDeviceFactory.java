package com.mateacademy.abstractfactory;

public class RazerDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
       return new RazerMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RazerKeyboard();
    }
}
