package com.mateacademy.factorymethod;

public class PythonDeveloperHunter implements DeveloperHunter {
    @Override
    public Developer hunt() {
        return PythonDeveloper::new;
    }
}
