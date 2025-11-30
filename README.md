⭐ Word Frequency Analyzer — Java Mini Project

A Java-based application that reads text, processes words, and analyzes their frequency using different underlying data structures.
This project is designed for understanding time complexity, data structure efficiency, and real-world text processing.

📌 Features

✔️ Reads and processes text from file or standard input

✔️ Normalizes text (lowercasing, trimming punctuation, tokenizing words)

✔️ Counts word frequency using three separate data structures:

> HashMapCounter → Fastest (O(1) average search/insert)

> BSTCounter → Tree-based (lexicographically ordered output)

> LinkedListCounter → Linear search (for comparison/learning)

✔️ Modular design — each counter implements a common WordCounter interface

✔️ Easily extendable for benchmarking or UI integration (Swing/JavaFX/Web)

📂 Project Structure
Word-Frequency-Analyzer/
│
├── Main.java
├── WordCounter.java
├── TextProcessor.java
├── HashMapCounter.java
├── LinkedListCounter.java
├── BSTCounter.java
│
└── README.md

🧠 How It Works
1️⃣ Text Processing

The TextProcessor class handles:
-Cleaning text
-Removing punctuation
-Converting to lowercase
-Splitting into tokens (words)

2️⃣ Word Counting Data Structures

Each counter implements the WordCounter interface.
| Counter               | Data Structure     | Complexity       | Notes                        |
| --------------------- | ------------------ | ---------------- | ---------------------------- |
| **HashMapCounter**    | HashMap            | O(1) average     | Best performance             |
| **BSTCounter**        | Binary Search Tree | O(log n) average | Sorted output                |
| **LinkedListCounter** | Singly Linked List | O(n)             | Slowest; used for comparison |

3️⃣ Main Program Flow (Main.java)

-Takes file input or standard input
-Processes text via TextProcessor
-Selects a counter implementation
-Prints final frequency table

📊 Performance Comparison (Conceptual)

| Implementation        | Time Complexity | Suitable For         |
| --------------------- | --------------- | -------------------- |
| **HashMapCounter**    | O(n)            | Large datasets       |
| **BSTCounter**        | O(n log n)      | Sorted results       |
| **LinkedListCounter** | O(n²)           | Small inputs & study |

🔧 Future Enhancements

-Graphical User Interface (JavaFX / Swing)
-File selection dialog
-Support for stop-words removal
-Graphs for performance comparison
-Integration with Apache POI to export results to Excel
-Web version (Spring Boot / Flask)

👤 Author

Aayush Manoj Thakare 
Computer Engineering, I2IT Pune 
MERN Stack Developer 
