package wordcounter;

public class BSTCounter implements WordCounter {
    private class Node {
        String word;
        int count;
        Node left, right;

        Node(String word) {
            this.word = word;
            this.count = 1;
        }
    }

    private Node root;

    public void addWord(String word) {
        root = insert(root, word);
    }

    private Node insert(Node node, String word) {
        if (node == null) return new Node(word);
        int cmp = word.compareTo(node.word);
        if (cmp < 0) node.left = insert(node.left, word);
        else if (cmp > 0) node.right = insert(node.right, word);
        else node.count++;
        return node;
    }

    public int getFrequency(String word) {
        Node node = root;
        while (node != null) {
            int cmp = word.compareTo(node.word);
            if (cmp < 0) node = node.left;
            else if (cmp > 0) node = node.right;
            else return node.count;
        }
        return 0;
    }
}
