package com.manish.bytecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract class CopyBytes {

    protected void copyFile(FileInputStream fileInputStream,
                            FileOutputStream fileOutputStream) throws IOException {
        int byteToRead;
        while ((byteToRead = fileInputStream.read()) != -1) {
            fileOutputStream.write(byteToRead);
        }
    }

    protected abstract void copyIt();
}
