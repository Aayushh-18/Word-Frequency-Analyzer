package wordcounter;

import java.util.Scanner;

public class TextProcessor {
    private WordCounter counter;

    public TextProcessor(WordCounter counter) {
        this.counter = counter;
    }

    public void processText(String text) {
        Scanner scanner = new Scanner(text);
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                counter.addWord(word);
            }
        }
        scanner.close();
    }

    public int getFrequency(String word) {
        return counter.getFrequency(word.toLowerCase());
    }
}
