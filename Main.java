package wordcounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your text (type 'END' to finish):");

        StringBuilder inputText = new StringBuilder();
        while (true) {
            String line = inputScanner.nextLine();
            if (line.equalsIgnoreCase("END")) break;
            inputText.append(line).append(" ");
        }

        System.out.print("Enter a word to check its frequency: ");
        String wordToCheck = inputScanner.next();
        inputScanner.close();

        runCounter("HashMap", new HashMapCounter(), inputText.toString(), wordToCheck);
        runCounter("BST", new BSTCounter(), inputText.toString(), wordToCheck);
        runCounter("LinkedList", new LinkedListCounter(), inputText.toString(), wordToCheck);
    }

    private static void runCounter(String name, WordCounter counter, String text, String word) {
        TextProcessor processor = new TextProcessor(counter);

        long start = System.nanoTime();
        processor.processText(text);
        long end = System.nanoTime();

        double timeMs = (end - start) / 1_000_000.0;

        System.out.println("\n=== Using " + name + " ===");
        System.out.printf("Time taken: %.2f ms%n", timeMs);
        System.out.println("Frequency of \"" + word + "\": " + processor.getFrequency(word));
    }
}
