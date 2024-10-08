/**
 * Capstone Project: Six Little Words Puzzle Creator
 * Class: Tokenizer
 * Author: Panagiotis Georgiadis
 * Date: 10/7/2024
 *
 * This class is responsible for breaking words into tokens and randomizing them.
 * It provides functionality to create tokens from words and shuffle them for the puzzle.
 */

package com.p_georgiadis.wordpuzzle;

import java.util.ArrayList;
import java.util.Collections;

public class Tokenizer {
    /**
     * Breaks each word from the provided ArrayList into tokens.
     * For words with even length, tokens are two letters long.
     * For words with odd length, the last token is three letters long.
     *
     * @param words ArrayList of words to be tokenized
     * @return ArrayList of tokens created from all supplied words
     */
    public ArrayList<String> getTokens(ArrayList<String> words) {
        ArrayList<String> tokens = new ArrayList<>();
        for (String word : words) {
            int length = word.length();
            if (length == 1) {
                tokens.add(word);
            } else if (length % 2 == 0) {
                for (int i = 0; i < length; i += 2) {
                    tokens.add(word.substring(i, i + 2));
                }
            } else {
                for (int i = 0; i < length - 3; i += 2) {
                    tokens.add(word.substring(i, i + 2));
                }
                tokens.add(word.substring(length - 3));
            }
        }
        return tokens;
    }

    /**
     * Randomizes the order of the tokens in the ArrayList.
     *
     * @param tokens ArrayList of tokens to be randomized
     * @return New ArrayList with the tokens in random order
     */
    public ArrayList<String> randomizeTokens(ArrayList<String> tokens) {
        ArrayList<String> randomizedTokens = new ArrayList<>(tokens);
        Collections.shuffle(randomizedTokens);
        return randomizedTokens;
    }
}