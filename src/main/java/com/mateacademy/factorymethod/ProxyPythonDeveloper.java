package com.mateacademy.factorymethod;

public class ProxyPythonDeveloper implements Developer {
    private float experience;
    private PythonDeveloper pythonDeveloper;

    public ProxyPythonDeveloper(float experience) {
        this.experience = experience;
    }

    @Override
    public Developer getDeveloper() {
        if (pythonDeveloper == null) {
            pythonDeveloper = new PythonDeveloper(experience);
        }
        return pythonDeveloper;
    }
}
