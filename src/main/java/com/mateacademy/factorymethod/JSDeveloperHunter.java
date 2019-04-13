package com.mateacademy.factorymethod;

public class JSDeveloperHunter implements DeveloperHunter {
    @Override
    public Developer hunt() {
        return JSDeveloper.getInstance();
    }
}
