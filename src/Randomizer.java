import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {
    public static String getRandomWord() throws FileNotFoundException, IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("Recources/russian_nouns.txt"));

        String line;

        List<String> words = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            words.add(line);
        }

        Random rand = new Random(System.currentTimeMillis());
        return words.get(rand.nextInt(words.size()));
    }
}
