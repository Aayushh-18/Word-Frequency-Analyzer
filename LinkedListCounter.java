package wordcounter;

public class LinkedListCounter implements WordCounter {
    private class Node {
        String word;
        int count;
        Node next;

        Node(String word) {
            this.word = word;
            this.count = 1;
        }
    }

    private Node head;

    public void addWord(String word) {
        Node current = head;
        while (current != null) {
            if (current.word.equals(word)) {
                current.count++;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(word);
        newNode.next = head;
        head = newNode;
    }

    public int getFrequency(String word) {
        Node current = head;
        while (current != null) {
            if (current.word.equals(word)) {
                return current.count;
            }
            current = current.next;
        }
        return 0;
    }
}
