package com.example.counter;

public class Counter {

    public static int getCharCount(String input) {
        if(input == null){
            return -1;
        }
        else{
            return input.length();
        }
    }

    public static int getWordCount(String input) {
        if (input == null) {
            return -1;
        } else {
            int wordCount = 0;
            String[] words = input.trim().split("\\s+");
            for (String word : words) {
                if (word.matches(".*[a-zA-Z]+.*")) {
                    wordCount++;
                }
            }
            return wordCount;
        }
    }

    public static int getSentenceCount(String input) {
        if (input == null) {
            return -1;
        } else {
            return input.trim().split("[.!?;]+").length;
        }
    }
    public static int getNumberCount(String input) {
        if (input == null) {
            return -1;
        } else {
            int count = 0;
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            return count;
        }
    }
}