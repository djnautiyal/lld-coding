package com.learn.design_patterns.creational.factory.generating_charsets;

import java.util.function.Supplier;

public enum CharSetType {
    LOWERCASE_LETTERS(() -> new LowercaseLetters()),
    UPPERCASE_LETTERS(() -> new UppercaseLetters()),
    NUMBERS(() -> new Numbers()),
    SPECIAL_CHARACTERS(() -> new SpecialCharacters());

    private final Supplier<CharSet> constructor;

    CharSetType(Supplier<CharSet> constructor){
        this.constructor = constructor;
    }
    public Supplier<CharSet> getConstructor(){
        return constructor;
    }
}
