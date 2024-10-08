package com.p_georgiadis.wordpuzzle;



/**
 * Capstone Project: Six Little Words Puzzle Creator
 * Class: OOAD Course 1 Capstone Project
 * Author: Panagiotis Georgiadis
 * Date: 10/7/2024
 *
 * This file serves as the main entry point for the Six Little Words puzzle creator.
 * It initializes all the classes and manages the overall flow of the program.
 * The main function is responsible for basic instantiation and execution of methods
 * from the other classes. The goal is to create a puzzle using six words and their
 * corresponding clues, and then output the puzzle components (tokens, clues, and answer key) to the console.
 */

import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {
        // Instantiate the Reader, Tokenizer, and PuzzlePrint classes
        Reader reader = new Reader();
        Tokenizer tokenizer = new Tokenizer();
        PuzzlePrint printer = new PuzzlePrint();

        // Submit the 6 required words and corresponding clues
        reader.submit("printer", "Device made to waste ink and paper");
        reader.submit("elephant", "Large animal with signature trunk and ears");
        reader.submit("guitar", "Strum it or pluck it to make music");
        reader.submit("umbrella", "Protection from rain");
        reader.submit("computer", "High-speed time wasting calculating machine");
        reader.submit("penguin", "Formally dressed flightless bird");

        // Retrieve the words and clues
        ArrayList<String> words = reader.getWords();
        ArrayList<String> clues = reader.getClues();

        // Tokenize the words
        ArrayList<String> tokens = tokenizer.getTokens(words);

        // Randomize the tokens
        ArrayList<String> randomizedTokens = tokenizer.randomizeTokens(tokens);

        // Print the puzzle components
        System.out.println("Six Little Words");
        printer.printTokens(randomizedTokens);
        printer.printClues(clues);
        printer.printAnswerKey(words);
    }
}