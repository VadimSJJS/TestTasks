package hangman;

import java.util.List;

// HangmanUI: отвечает за вывод информации и взаимодействие с пользователем
public class HangmanUI {
    public static void displayStatus(Word word, int lives, List<Character> guessedLetters) {
        System.out.println("Current word: " + word.getGuessedWord());
        System.out.println("Lives remaining: " + lives);
        System.out.println("Guessed letters: " + guessedLetters);
        drawHangman(lives);
    }

    public static void drawHangman(int lives) {
        switch (lives) {
            case 6 -> System.out.println(" +---+\n     |\n     |\n     |\n    ===");
            case 5 -> System.out.println(" +---+\n O   |\n     |\n     |\n    ===");
            case 4 -> System.out.println(" +---+\n O   |\n |   |\n     |\n    ===");
            case 3 -> System.out.println(" +---+\n O   |\n/|   |\n     |\n    ===");
            case 2 -> System.out.println(" +---+\n O   |\n/|\\  |\n     |\n    ===");
            case 1 -> System.out.println(" +---+\n O   |\n/|\\  |\n/    |\n    ===");
            case 0 -> System.out.println(" +---+\n O   |\n/|\\  |\n/ \\  |\n    ===");
        }
    }
}
