package com.manish.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesTryWithResource extends CopyBytes {
    private final String fromFile;
    private final String toFile;

    public CopyBytesTryWithResource(final String fromFile,
                                    final String toFile) {
        this.fromFile = fromFile;
        this.toFile = toFile;
    }

    public void copyIt() {
        try (FileInputStream fileInputStream = new FileInputStream(fromFile);
             FileOutputStream fileOutputStream = new FileOutputStream(toFile)) {
            copyFile(fileInputStream, fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
