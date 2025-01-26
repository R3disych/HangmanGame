import java.util.Scanner;

public class Checker {
    private static String letter;
    private static final String DEAD = "Вы исчерпали все три попытки, человечек умер! ;(";
    private static final String REMAINING_ATTEMPS = "\nНе угадали! Количество оставшихся попыток: %s \n";
    private static final String TRUE_MESSAGE = "Вы угадали букву!";

    public static void inputter() {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextLine()) {
            letter = (sc.nextLine()).toLowerCase();
        } else { //пока не работает, считывает введенную цифру как String
            System.out.println("Вы ввели не букву, попробуйте еще раз");
        }
    }

    public static void check() {
        if ((Gallows.getName1()).contains(letter)) {
            System.out.println(TRUE_MESSAGE);
            Gallows.plusGuessedLetters();
            if (Gallows.checkWin()) {
                System.out.println("Поздравляем, вы выиграли!");
            }
        } else {
            Game.numsOfTry++;
            Game.outNumsOfTry--;
            if ((Game.numsOfTry) < 3) {
                System.out.printf(REMAINING_ATTEMPS, Game.outNumsOfTry);
            } else if (Game.numsOfTry == 3) {
                System.out.println(DEAD);
                Game.stopGame();
            }
        }
    }

    public static String getLetter() {
        return letter;
    }
}
