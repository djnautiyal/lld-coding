package com.learn.design_patterns.creational.factory.generating_charsets;

public class CharSetFactory {
    static CharSet getCharSet(CharSetType type){
        return type.getConstructor().get();
    }
}
