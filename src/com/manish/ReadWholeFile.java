package com.manish;

import java.io.IOException;
import java.nio.file.*;

public class ReadWholeFile {
    public static void main(String[] args) {
        usingPaths();
        usingFileSystems();
    }

    private static void usingFileSystems() {
        FileSystem fileSystem = FileSystems.getDefault();
        Path path = fileSystem.getPath("src/com/manish/demo.txt");
        printFileUsingPath(path);
    }

    private static void usingPaths() {
        // Shortcut For FileSystem.getDefault().getPath("src/com/manish/demo.txt");
        Path path = Paths.get("src/com/manish/demo.txt");
        printFileUsingPath(path);
    }

    private static void printFileUsingPath(Path path) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            for (byte data: bytes) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
