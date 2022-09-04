package com.manish.objectstreams;

public class ObjectStreamTest {
    public static void main(String[] args) {
        Dog dogToWriter = new Dog("Bujjo", 6);

        String fileName = "resources/dog.txt";
        DogObjectWriter dogObjectWriter = new DogObjectWriter(dogToWriter);
        dogObjectWriter.write(fileName);

        DogObjectReader dogObjectReader = new DogObjectReader();
        Dog dogFromFile = dogObjectReader.readObjectFrom(fileName);

        System.out.println("Dog Name:: " + dogFromFile.getName());
        System.out.println("Dog Age:: " + dogFromFile.getAge());
    }
}
