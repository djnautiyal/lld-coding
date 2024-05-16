package com.learn.design_patterns.creational.factory.generating_charsets;

public class Generator {
    public static void main(String[] args) {
        CharSetType type = CharSetType.UPPERCASE_LETTERS;
        CharSet charset = CharSetFactory.getCharSet(type);
        System.out.println(charset.getCharset());

        type = CharSetType.NUMBERS;
        charset = CharSetFactory.getCharSet(type);
        System.out.println(charset.getCharset());

        type = CharSetType.SPECIAL_CHARACTERS;
        charset = CharSetFactory.getCharSet(type);
        System.out.println(charset.getCharset());

        type = CharSetType.LOWERCASE_LETTERS;
        charset = CharSetFactory.getCharSet(type);
        System.out.println(charset.getCharset());

    }
}
