import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        String hiddenWord = "козел";
        List<String> hiddenLetters = List.of(hiddenWord.split("")); //лучше toCharArray
        System.out.println(hiddenLetters);
        List<String> guessedLetters = new ArrayList<>();
        for(int i = 0; i < hiddenLetters.size(); i++){ //может
            guessedLetters.add("*");
        }
        System.out.println(guessedLetters);

        String letter = "з";
        int hasLetter = hiddenLetters.indexOf(letter); //может быть несколько одинаковых букв
        if(hasLetter > 0) {
            guessedLetters.set(hasLetter, hiddenLetters.get(hasLetter));
        }
        System.out.println(guessedLetters);
    }
}
