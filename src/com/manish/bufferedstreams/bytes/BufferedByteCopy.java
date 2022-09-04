package com.manish.bufferedstreams.bytes;

import java.io.*;

public class BufferedByteCopy {
    private final String fromFile;
    private final String toFile;

    public BufferedByteCopy(final String fromFile,
                            final String toFile) {
        this.fromFile = fromFile;
        this.toFile = toFile;
    }

    public void copyIt() {
        // default buffer size => 8192 bytes => 8KB
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fromFile));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(toFile))) {

            System.out.println("Total Bytes Available To Read:: " + bufferedInputStream.available());
            int valueToWrite = bufferedInputStream.read();

            while (valueToWrite != -1) {
                int available = bufferedInputStream.available();
                System.out.println("Number Of Bytes Available To Read:: " + available);

                bufferedOutputStream.write(valueToWrite);
                valueToWrite = bufferedInputStream.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
