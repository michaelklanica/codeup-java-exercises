
import java.util.Random;

public class ServerNameGenerator {
    public static String[] nouns = {"man", "woman", "cat", "dog", "bird", "rockstar", "vehicle", "planet", "cloud",
            "rain"};
    public static String[] adjectives = {"dark", "happy", "sad", "angry", "broken", "strong", "hairy", "proud", "huge",
            "tiny"};

    public static String getRandomServerName() {
        int randomNoun = new Random().nextInt(10);
        int randomAdjective = new Random().nextInt(10);
        return adjectives[randomAdjective] + "-" + nouns[randomNoun];
    }

    public static void main(String[] args) {

            System.out.println(getRandomServerName());

    }



}
