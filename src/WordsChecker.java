import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.set.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String searchingWord) {
        return set.contains(searchingWord);
    }
}
