import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static boolean isRunning;
    private static boolean ProgramStatus = true;
    static int numsOfTry;
    static int outNumsOfTry;
    private static final String MESSAGE = "\nВведите букву: ";

    public static void initGame() {
        numsOfTry = 0;
        outNumsOfTry = 3;
        System.out.println("Добро пожаловать в виселицу!\nДля старта игры введите Start для выхода - Exit");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("exit")) {
            System.out.println("*Выхожу из игры ;( * \nВозвращайся!");
            ProgramStatus = false;
        } else if (answer.equalsIgnoreCase("start")) {
            isRunning = true;
        }
    }

    public static void startGame() {
        Gallows gallows = new Gallows();
        gallows.setHiddenWord();

        List<String> hiddenLetters = List.of(gallows.getHiddenWord().split(""));

        List<String> guessedLetters = new ArrayList<>();
        for(int i = 0; i < hiddenLetters.size(); i++){ //может
            guessedLetters.add("*");
        }
        //пока так, временно
        while (isRunning) {
            gallows.printGallowsField();
            System.out.println(MESSAGE);
            String letter = Checker.inputter();
            Checker.check();
            int hasLetter = hiddenLetters.indexOf(letter); //может быть несколько одинаковых букв
            if(hasLetter > 0) {
                guessedLetters.set(hasLetter, hiddenLetters.get(hasLetter));
            }
            System.out.println(guessedLetters);
        }
    }

    public static void stopGame() {
        isRunning = false;
    }

    public static boolean getProgramStatus() {
        return ProgramStatus;
    }
}
