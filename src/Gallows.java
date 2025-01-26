import java.util.Arrays;
import java.util.List;

public class Gallows {
    private final List<String> name = Arrays.asList("А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л",
            "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я");
    private static String NAME1 = "абрикос"; //возможно должно быть final, значение берется
    // случайно из списка существительных в именительном падеже
    private static int numsOfLetters = NAME1.length();
    private static int guessedLetters;

    private final String HANGMAN = "   _______\n" +
            "  |/      |\n" +
            "  |      (_)\n" +
            "  |      \\|/\n" +
            "  |       |\n" +
            "  |      / \\\n" +
            "  |\n" +
            " _|___";


    public void printGallowsField() {
        System.out.println(HANGMAN);
        for(int i = 0; i < name.size(); i++) {
            if(i == 11 || i == 22) {
                System.out.println();
            }
            System.out.printf(name.get(i) + " ");
        }
    }

    public static String getName1() {
        return NAME1;
    }

    public static void plusGuessedLetters() {
        guessedLetters++;
    }

    public static boolean checkWin() {
        return guessedLetters == numsOfLetters;
    }
}
