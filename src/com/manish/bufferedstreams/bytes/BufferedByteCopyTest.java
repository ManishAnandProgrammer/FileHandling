package com.manish.bufferedstreams.bytes;

public class BufferedByteCopyTest {
    public static void main(String[] args) {
        String fromFile = "resources/byte_copy_from.txt";
        String toFile = "resources/byte_copy_to.txt";
        BufferedByteCopy bufferedByteCopy = new BufferedByteCopy(fromFile, toFile);
        bufferedByteCopy.copyIt();
    }
}
