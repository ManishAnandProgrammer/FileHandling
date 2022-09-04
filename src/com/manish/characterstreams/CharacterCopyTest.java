package com.manish.characterstreams;

public class CharacterCopyTest {
    public static void main(String[] args) {
        CharacterCopy characterCopy =
                new CharacterCopy("resources/from.txt", "resources/to.txt");
        characterCopy.copyIt();
    }
}
