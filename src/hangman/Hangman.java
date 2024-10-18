package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Класс для управления логикой игры

public class Hangman {
    private static final int MAX_LIVES = 6;
    private final List<String> words = List.of("java", "programming", "hangman", "oop", "game");
    private final Word wordToGuess;
    private int lives;
    private final List<Character> guessedLetters;

    public Hangman() {
        this.wordToGuess = new Word(getRandomWord());
        this.lives = MAX_LIVES;
        this.guessedLetters = new ArrayList<>();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (lives > 0 && wordToGuess.hasUnderscores()) {
            HangmanUI.displayStatus(wordToGuess, lives, guessedLetters);
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter.");
                continue;
            }

            guessedLetters.add(guess);

            if (wordToGuess.guessLetter(guess)) {
                System.out.println("Good guess!");
            } else {
                lives--;
                System.out.println("Wrong guess! You lost a life.");
            }
        }

        if (lives > 0) {
            System.out.println("Congratulations! You've guessed the word: " + wordToGuess.getWord());
        } else {
            HangmanUI.drawHangman(0);
            System.out.println("Game Over! The word was: " + wordToGuess.getWord());
        }

        scanner.close();
    }

    private String getRandomWord() {
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }
}
