package com.p_georgiadis.wordpuzzle;

import java.util.ArrayList;

/**
 * Capstone Project: Six Little Words Puzzle Creator
 * Class: PuzzlePrint
 * Author: Panagiotis Georgiadis
 * Date: 10/7/2024
 *
 * The PuzzlePrint class is responsible for printing the puzzle components
 * including tokens, clues, and the answer key.
 */

public class PuzzlePrint {

    /**
     * Prints the tokens in a table format with 4 tokens per line, tab-delimited.
     *
     * @param tokens The list of tokens to be printed.
     */
    public void printTokens(ArrayList<String> tokens) {
        System.out.println("Tokens");
        for (int i = 0; i < tokens.size(); i++) {
            System.out.print(tokens.get(i) + "\t");
            if ((i + 1) % 4 == 0) {
                System.out.println(); // New line after every 4 tokens
            }
        }
        System.out.println(); // Ensure new line at the end
    }

    /**
     * Prints the list of clues.
     *
     * @param clues The list of clues to be printed.
     */
    public void printClues(ArrayList<String> clues) {
        System.out.println("Clues");
        for (String clue : clues) {
            System.out.println(clue);
        }
    }

    /**
     * Prints the answer key with the original words in uppercase.
     *
     * @param words The list of words to be printed as the answer key.
     */
    public void printAnswerKey(ArrayList<String> words) {
        System.out.println("Answer Key");
        for (String word : words) {
            System.out.println(word);
        }
    }
}