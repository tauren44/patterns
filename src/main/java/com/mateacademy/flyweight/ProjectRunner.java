package com.mateacademy.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();
        List<Developer> developerList = new ArrayList<>();

        developerList.add(factory.getDeveloperBySpeciality("java"));
        developerList.add(factory.getDeveloperBySpeciality("java"));
        developerList.add(factory.getDeveloperBySpeciality("java"));

        developerList.add(factory.getDeveloperBySpeciality("JS"));
        developerList.add(factory.getDeveloperBySpeciality("JS"));
        developerList.add(factory.getDeveloperBySpeciality("JS"));

        for(Developer dev : developerList) {
            dev.writeCode();
        }
    }
}
