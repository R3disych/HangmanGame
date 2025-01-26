import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String name1 = "абрикос";
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        System.out.println(name1.contains(letter));
    }
}
