package com.manish.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesTryCatchFinally extends CopyBytes {
    private final String fromFile;
    private final String toFile;

    public CopyBytesTryCatchFinally(final String fromFile,
                                    final String toFile) {
        this.fromFile = fromFile;
        this.toFile = toFile;
    }

    public void copyIt() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(fromFile);
            fileOutputStream = new FileOutputStream(toFile);

            copyFile(fileInputStream, fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            closeTheInputStream(fileInputStream);
            closeTheOutputStream(fileOutputStream);
        }
    }

    private static void closeTheOutputStream(FileOutputStream fileOutputStream) {
        try {
            if (fileOutputStream != null) fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void closeTheInputStream(FileInputStream fileInputStream) {
        try {
            if (fileInputStream != null) fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
