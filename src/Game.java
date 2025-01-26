import java.util.Scanner;

public class Game {
    private static boolean isRunning;
    private static boolean ProgramStatus = true;
    static int numsOfTry;
    static int outNumsOfTry = 3;
    private static final String MESSAGE = "\nВведите букву: ";

    public static void initGame() {
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
        while (isRunning) {
            gallows.printGallowsField();
            System.out.println(MESSAGE);
            Checker.inputter();
            Checker.check();
        }
    }

    public static void stopGame() {
        isRunning = false;
    }

    public static boolean getProgramStatus() {
        return ProgramStatus;
    }
}
