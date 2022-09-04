package com.manish.objectstreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DogObjectReader {
    public Dog readObjectFrom(final String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Dog) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
