package com.manish.nio;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMethodsTry {
    public static void main(String[] args) {
        Path path = Paths.get("resources/hello_world.txt");
        toUri(path);
        absolutePath(path);
        realPath(path);
        resolve();
        findPathBetweenTwoPaths();
    }

    private static void findPathBetweenTwoPaths() {
        Path first = Paths.get("resources/hello_world.txt");
        Path second = Paths.get("resources/dog.txt");

        Path linkPath = first.relativize(second);
        System.out.println("Link Path::");
        System.out.println(linkPath);
    }

    private static void resolve() {
        // for joining two paths use this method
        Path first = Paths.get("resources/");
        Path joinedPath = first.resolve("hello_world.txt");
        System.out.println(joinedPath);
    }

    private static void toUri(Path path) {
        // If you need to convert the path to a string that can
        // be opened from a browser, you can use toUri
        System.out.println(path.toUri());
    }

    private static void absolutePath(Path path) {
        //The toAbsolutePath method converts the user input and returns
        //a Path that returns useful values when queried.
        //The file does not need to exist for this method to work.
        System.out.println(path.toAbsolutePath());
    }

    private static void realPath(Path path) {
        try {
            Path realPath = path.toRealPath();
            System.out.println(realPath);
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
            // Logic for case when file doesn't exist.
        } catch (IOException x) {
            System.err.format("%s%n", x);
            // Logic for other sort of file error.
        }
    }
}
