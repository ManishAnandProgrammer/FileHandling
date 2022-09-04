package com.manish.bufferedstreams.character;

import java.io.*;

public class LineCopyBufferedReaderWriter {
    private final String fromFile;
    private final String toFile;

    public LineCopyBufferedReaderWriter(String fromFile, String toFile) {
        this.fromFile = fromFile;
        this.toFile = toFile;
    }

    public void copyIt() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fromFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(toFile))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
