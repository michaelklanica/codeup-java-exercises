
import java.util.Random;

public class ServerNameGenerator {
    public static String[] nouns = {"man", "woman", "cat", "dog", "bird", "rockstar", "vehicle", "planet", "cloud",
            "rain"};
    public static String[] adjectives = {"dark", "happy", "sad", "angry", "broken", "strong", "hairy", "proud", "huge",
            "tiny"};

    public static String getRandomWord(String[] words) {
        Random rnd = new Random();
        int randomIndex = rnd.nextInt(words.length);
        return words[randomIndex];
    }

    public static void main(String[] args) {

            System.out.println(getRandomWord(adjectives) + "-" + getRandomWord(nouns));

    }



}
