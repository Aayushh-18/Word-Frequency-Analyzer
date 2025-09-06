package wordcounter;

public interface WordCounter {
    void addWord(String word);
    int getFrequency(String word);
}
