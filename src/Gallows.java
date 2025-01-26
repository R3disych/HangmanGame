import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Gallows {
    private final List<String> name = Arrays.asList("А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л",
            "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я");
    private static String hiddenWord;

    static {
        try {
            hiddenWord = Randomizer.getRandomWord();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int numsOfLetters = hiddenWord.length();
    private static int guessedLetters;

    public void printGallowsField() {
        switch(Game.outNumsOfTry) {
            case 3: System.out.println(Hangman.INITIAL_HANGMAN); break;
            case 2: System.out.println(Hangman.FIRST_HANGMAN); break;
            case 1: System.out.println(Hangman.SECOND_HANGMAN); break;
        }

        for(int i = 0; i < name.size(); i++) {
            if(i == 11 || i == 22) {
                System.out.println();
            }
            System.out.printf(name.get(i) + " ");
        }
    }

    public static String getName1() {
        return hiddenWord;
    }

    public static void plusGuessedLetters() {
        guessedLetters++;
    }

    public static boolean checkWin() {
        return guessedLetters == numsOfLetters;
    }
}
