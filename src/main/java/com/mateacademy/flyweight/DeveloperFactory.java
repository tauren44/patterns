package com.mateacademy.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> DEVELOPERS = new HashMap<>();
    private static final String JAVA = "java";
    private static final String JS = "JS";

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = DEVELOPERS.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case JAVA:
                    System.out.println("Hiring Java dev");
                    developer = new JavaDeveloper();
                    break;
                case JS:
                    System.out.println("Hiring JS dev");
                    developer = new JSDeveloper();

            }
            DEVELOPERS.put(speciality, developer);
        }
        return developer;
    }
}
