package com.manish.objectstreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DogObjectWriter {
    private final Dog dog;

    public DogObjectWriter(Dog dog) {
        this.dog = dog;
    }

    public void write(final String toFile) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream(toFile))) {
            objectOutputStream.writeObject(dog);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
