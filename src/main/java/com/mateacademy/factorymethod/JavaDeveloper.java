package com.mateacademy.factorymethod;

public class JavaDeveloper implements Developer {
    private float experience;
    private String level;
    private String englishLevel;

    private static class Builder {
        private JavaDeveloper javaDeveloper;

        public Builder() {
            javaDeveloper = new JavaDeveloper();
        }

        public Builder setExperience (float exp) {
            javaDeveloper.experience = exp;
            return this;
        }

        public Builder setLevel (String lvl) {
            javaDeveloper.level = lvl;
            return this;
        }

        public Builder setEnglishLvl (String engLvl) {
            javaDeveloper.englishLevel = engLvl;
            return this;
        }

        public JavaDeveloper build() {
            return javaDeveloper;
        }

    }

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper.Builder().setExperience(0.5f).setLevel("Junior").setEnglishLvl("pre-i").build();
    }
}
