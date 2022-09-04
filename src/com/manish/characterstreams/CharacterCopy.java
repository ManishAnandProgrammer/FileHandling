package com.manish.characterstreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCopy {
    private final String fromFile;
    private final String toFile;

    public CharacterCopy(String fromFile, String toFile) {
        this.fromFile = fromFile;
        this.toFile = toFile;
    }

    public void copyIt() {
        try (FileReader fileReader = new FileReader(fromFile);
             FileWriter fileWriter = new FileWriter(toFile)) {

            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
