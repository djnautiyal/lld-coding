package com.learn.design_patterns.creational.factory.generating_charsets;

public interface CharSet {
    String getCharset();
}

class LowercaseLetters implements CharSet {
    @Override
    public String getCharset() {
        return "abcdefghijklmnopqrstuvwxyz";
    }
}

class UppercaseLetters implements CharSet {
    @Override
    public String getCharset() {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }
}

class Numbers implements CharSet {
    @Override
    public String getCharset() {
        return "0123456789";
    }
}

class SpecialCharacters implements CharSet {
    @Override
    public String getCharset() {
        return "!@#$%^&*()_+";
    }
}

