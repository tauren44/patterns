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
        JSDeveloper localInstance = instance;
        if (localInstance == null) {
            synchronized (JSDeveloper.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new JSDeveloper();
                    instance.setEnglishLevel("fluent");
                    instance.setExperience(3);
                    instance.setLevel("middle");
                }
            }
            return instance;
        }
    @Override
    public Developer getDeveloper() {
         return getInstance();
    }
}
