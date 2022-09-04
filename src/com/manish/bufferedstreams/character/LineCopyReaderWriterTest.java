package com.manish.bufferedstreams.character;

public class LineCopyReaderWriterTest {
    public static void main(String[] args) {
        LineCopyBufferedReaderWriter lineCopy =
                new LineCopyBufferedReaderWriter("resources/line_copy_from.txt",
                        "resources/line_copy_to.txt");
        lineCopy.copyIt();
    }
}
