package com.mateacademy.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality) {
                case "java":
                    System.out.println("Hiring Java dev");
                    developer = new JavaDeveloper();
                    break;
                case "JS":
                    System.out.println("Hiring JS dev");
                    developer = new JSDeveloper();

            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
