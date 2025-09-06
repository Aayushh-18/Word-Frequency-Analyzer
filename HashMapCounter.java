package wordcounter;

import java.util.HashMap;

public class HashMapCounter implements WordCounter {
    private HashMap<String, Integer> map = new HashMap<>();

    public void addWord(String word) {
        map.put(word, map.getOrDefault(word, 0) + 1);
    }

    public int getFrequency(String word) {
        return map.getOrDefault(word, 0);
    }
}
