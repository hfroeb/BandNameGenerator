import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("src/adjectives");
        File f2 = new File("src/adjectives2");
        File f3 = new File("src/nouns");

        Band band = new Band(Main.getRandomWord(f), Main.getRandomWord(f2), Main.getRandomWord(f3));
        System.out.println(band.toString());
    }

    public static String getRandomWord(File file) throws FileNotFoundException {
        String word = null;

        try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {
            String line = null;

            Random randomGenerator = new Random();
            ArrayList<String> firstWordBank = new ArrayList<>();

            while ((line = lnr.readLine()) != null) {
                firstWordBank.add(lnr.getLineNumber() - 1, line);
            }
            int random = randomGenerator.nextInt(firstWordBank.size());
            word = firstWordBank.get(random);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return word;
    }
}
