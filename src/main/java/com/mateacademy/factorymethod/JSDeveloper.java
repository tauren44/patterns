package com.mateacademy.factorymethod;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class JSDeveloper implements Developer {

    private float experience;
    private String level;
    private String englishLevel;
    private static JSDeveloper instance;

    private JSDeveloper() {}

    public static JSDeveloper getInstance() {
        if (instance == null) {
            instance = new JSDeveloper();
            instance.setEnglishLevel("fluent");
            instance.setExperience(3);
            instance.setLevel("middle");
        }
        return instance;
    }

    @Override
    public Developer getDeveloper() {
         return getInstance();
    }
}
