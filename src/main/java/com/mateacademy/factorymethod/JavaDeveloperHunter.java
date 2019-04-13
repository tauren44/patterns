package com.mateacademy.factorymethod;

public class JavaDeveloperHunter implements DeveloperHunter {
    @Override
    public Developer hunt() {
        return JavaDeveloper::new;
    }
}
