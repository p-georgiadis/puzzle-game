/**
 * Capstone Project: Six Little Words Puzzle Creator
 * Class: Reader
 * Author: Panagiotis Georgiadis
 * Date: 10/7/2024
 *
 * This class is responsible for collecting and managing words and clues for the puzzle.
 * It provides functionality to submit word-clue pairs and retrieve the stored data.
 */

package com.p_georgiadis.wordpuzzle;

import java.util.ArrayList;

public class Reader {
    private ArrayList<String> words = new ArrayList<>();
    private ArrayList<String> clues = new ArrayList<>();

    /**
     * Submits a word and its corresponding clue to the puzzle.
     * Words must be at least 5 characters long to be accepted.
     *
     * @param word The word to be added to the puzzle
     * @param clue The clue corresponding to the word
     */
    public void submit(String word, String clue) {
        if (word.length() >= 5) {
            words.add(word.toUpperCase());
            clues.add(clue);
        } else {
            System.out.println("Word must be at least 5 characters long.");
        }
    }

    /**
     * Returns the total number of words submitted.
     *
     * @return The number of words currently stored
     */
    public int getWordCount() {
        return words.size();
    }

    /**
     * Retrieves the last 6 submitted words (or all if less than 6).
     *
     * @return ArrayList containing the most recent words
     */
    public ArrayList<String> getWords() {
        int start = Math.max(0, words.size() - 6);
        return new ArrayList<>(words.subList(start, words.size()));
    }

    /**
     * Retrieves the last 6 submitted clues (or all if less than 6).
     *
     * @return ArrayList containing the most recent clues
     */
    public ArrayList<String> getClues() {
        int start = Math.max(0, clues.size() - 6);
        return new ArrayList<>(clues.subList(start, clues.size()));
    }
}