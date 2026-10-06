package com.example.counter;

public class Counter {

    public static int getCharCount(String input) {
        return input.length();
    }

    public static int getWordCount(String input) {
        return input.trim().split("\\s+").length; // nuimami tarpai pradzioje ir pabaigoje ir pjausto teksta ten kur yyra tarpai
    }

    public static int getSentenceCount(String input) {
        return input.trim().split("[.!?]+").length;// skaidom elementus pagal sakinius kad juos atpazintu pagal juos elementus
    }

    public static int getNumberCount(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}