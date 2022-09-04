package com.manish.bytestreams;


public class CopyBytesTest {
    public static void main(String[] args) {
        CopyBytes copyBytesTryCatchFinally =
                new CopyBytesTryCatchFinally("resources/FirstFile.txt", "resources/SecondFile.txt");
        copyBytesTryCatchFinally.copyIt();

        CopyBytes copyBytesTryWithResource =
                new CopyBytesTryWithResource("resources/FirstFile.txt", "resources/SecondFile.txt");
        copyBytesTryWithResource.copyIt();

    }


}
