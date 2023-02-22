import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String searchingWord) {
        Set<String> set = new HashSet<>();

        set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));

        return set.contains(searchingWord);
    }
}
