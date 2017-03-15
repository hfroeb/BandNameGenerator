/**
 * Created by halleyfroeb on 3/2/17.
 */
public class Band {
    String firstWord;
    String secondWord;
    String thirdWord;

    public Band(String firstWord, String secondWord, String thirdWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.thirdWord = thirdWord;
    }

    public String toString() {
        return String.format(firstWord + " " + secondWord + " " + thirdWord);
    }


}
