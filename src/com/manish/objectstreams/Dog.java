package com.manish.objectstreams;

import java.io.Serializable;

public class Dog implements Serializable {
    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
