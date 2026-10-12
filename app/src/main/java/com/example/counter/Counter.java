package com.example.counter;

public class Counter {

    public static int getCharCount(String input) {
        return input.length();
    }

    public static int getWordCount(String input) {
        int wordCount = 0;
        for (String word : input.trim().split("\\s+")) {
            if (!word.isEmpty() && !Character.isDigit(word.charAt(0))) {
                wordCount++;
            }
        }
        return wordCount;
    }

    public static int getSentenceCount(String input) {
        return input.trim().split("[.!?;]+").length;
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