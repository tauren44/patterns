package com.mateacademy.prototype;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Developer implements Copyable {
    private String name;
    private int age;
    private String skill;

    @Override
    public Object copy() {
        return new Developer(name, age, skill);
    }
}
