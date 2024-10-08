package com.p_georgiadis.wordpuzzle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * Visit
 * https://junit.org/junit5/docs/5.4.0/api/org/junit/jupiter/api/Assertions.html
 * for the full list of available methods of assertion types.
 */
public class PuzzleTest {

    @Test
    public void puzzleTest1() {
        Reader r = new Reader();
        r.submit("printer", "Device made to waste ink and paper");
        r.submit("elephant", "Large animal with signature trunk and ears");
        r.submit("guitar", "Strum it or pluck it to make music");
        r.submit("umbrella", "Protection from rain");
        r.submit("computer", "High-speed time wasting calculating machine");
        r.submit("penguin", "Formally dressed flightless bird");
        ArrayList<String> words = r.getWords();
        assertEquals("PENGUIN", words.get(5), "Puzzle test 1 failed (using Reader submit and getWords)");
    }

    @Test
    public void puzzleTest2() {
        Reader r = new Reader();
        r.submit("printer", "Device made to waste ink and paper");
        r.submit("elephant", "Large animal with signature trunk and ears");
        r.submit("guitar", "Strum it or pluck it to make music");
        r.submit("umbrella", "Protection from rain");
        r.submit("computer", "High-speed time wasting calculating machine");
        r.submit("penguin", "Formally dressed flightless bird");
        ArrayList<String> clues = r.getClues();
        assertEquals("High-speed time wasting calculating machine", clues.get(4),
                "Puzzle test 2 failed (using Reader submit and getClues)");
    }

    @Test
    public void puzzleTest3() {
        Tokenizer t = new Tokenizer();
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        assertEquals(1, t.getTokens(words).size(), "Puzzle test 3.1 failed (using Tokenizer getTokens)");
        words.add("BC");
        assertEquals(2, t.getTokens(words).size(), "Puzzle test 3.2 failed (using Tokenizer getTokens)");
        words.add("DEF");
        assertEquals(3, t.getTokens(words).size(), "Puzzle test 3.3 failed (using Tokenizer getTokens)");
        words.add("GHIJ");
        assertEquals(5, t.getTokens(words).size(), "Puzzle test 3.4 failed (using Tokenizer getTokens)");
    }
}
