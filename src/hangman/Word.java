package hangman;

// Хранение состояния загадываемого слова
public class Word {
    private final String word;
    private final char[] guessedWord;

    public Word(String word) {
        this.word = word;
        this.guessedWord = new char[word.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
    }

    public boolean guessLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                guessedWord[i] = letter;
                found = true;
            }
        }
        return found;
    }

    public boolean hasUnderscores() {
        return String.valueOf(guessedWord).contains("_");
    }

    public String getGuessedWord() {
        return String.valueOf(guessedWord);
    }

    public String getWord() {
        return word;
    }
}
