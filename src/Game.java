public class Game {
    private static boolean isRunning;
    static int numsOfTry;
    static int outNumsOfTry = 3;
    private static final String MESSAGE = "\nВведите букву: ";

    public static void startGame() {
        isRunning = true;
        System.out.println("Добро пожаловать в виселицу!");
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

}
