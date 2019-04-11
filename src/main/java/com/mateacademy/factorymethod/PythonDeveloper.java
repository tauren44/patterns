package com.mateacademy.factorymethod;

import lombok.Setter;

@Setter
public class PythonDeveloper implements Developer {
    private float experience;
    private String level;
    private String englishLevel;

    public PythonDeveloper(float experience, String level, String englishLevel) {
        this.experience = experience;
        this.level = level;
        this.englishLevel = englishLevel;
    }

    public PythonDeveloper(float experience) {
        this.experience = experience;
    }

    public PythonDeveloper(){}

    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper(1.2f, "strong junior", "upper");
    }
}
