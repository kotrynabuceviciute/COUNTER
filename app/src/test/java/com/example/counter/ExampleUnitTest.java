package com.example.counter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

// char test

    @Test
    public void test2_HappyPath(){
        String given="labas rytas";

        int expected=11;
        int actual = Counter.getCharCount(given);

        assertEquals(expected,actual);

    }
    @Test
    public void getCharCount_test3_emptyText(){
        assertEquals(0,Counter.getCharCount(""));
    }

    @Test
    public void getCharCount_test4_spaces(){
        assertEquals(3,Counter.getCharCount("   "));
    }
    @Test
    public void getCharCount_test5_exclamationMark(){
        assertEquals(3,Counter.getCharCount("!!!"));
    }
    @Test
    public void getCharCount_test6_textWithNumbers(){
        assertEquals(11,Counter.getCharCount("debesis 123"));
    }
    @Test
    public void getCharCount_test7_singleChar(){
        assertEquals(1,Counter.getCharCount("a"));
    }

// word count

    @Test
    public void getWordCount_test1_happyPath(){
        assertEquals(2,Counter.getWordCount("labas rytas"));
    }
    @Test
    public void getWordCount_test2_emptyText(){
        assertEquals(0,Counter.getWordCount(""));
    }
    @Test
    public void getWordCount_test3_spaces(){
        assertEquals(0,Counter.getWordCount("   "));
    }
    @Test
    public void getWordCount_test4_exclamationMark(){
        assertEquals(0,Counter.getWordCount("!!!"));
    }
    @Test
    public void getWordCount_test5_textWithNumbers(){
        assertEquals(1,Counter.getWordCount("debesis 123 "));
    }
    @Test
    public void getWordCount_test6_singleWord(){
        assertEquals(1,Counter.getWordCount("debesis"));
    }
    @Test
    public void getWordCount_test7_wordCountInSentances(){
        assertEquals(6,Counter.getWordCount("Kokia niuri diena. Ir nuotaika prasta ! "));
    }

}