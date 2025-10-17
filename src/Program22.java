/*
Write a program to accept a sentence which may be terminated by either ‘.’, ‘?’ or ‘!’ only. Any other character may be ignored. The words may be separated by more than one blank space and are in uppercase. 

Perform the following tasks: 

(a) Accept the sentence and reduce all the extra blank space between two words to a single blank space. 

(b) Accept a word from the user which is a part of the sentence along with its position number and delete the word and display the sentence. 

Test your program for the following data and some random data: 

Example 1
INPUT: A    MORNING WALK IS A IS  BLESSING FOR   THE   WHOLE DAY.
WORD TO BE DELETED: IS
WORD POSITION IN THE SENTENCE: 6
OUTPUT: A MORNING WALK IS A BLESSING FOR THE WHOLE DAY. 

Example 2
INPUT: AS  YOU    SOW, SO   SO YOU REAP.
WORD TO BE DELETED: SO
WORD POSITION IN THE SENTENCE: 4
OUTPUT: AS YOU SOW, SO YOU REAP. 

Example 3
INPUT: STUDY WELL ##
OUTPUT: INVALID INPUT.
 */

import java.util.Scanner;

class Program22 {
    // Declaration of instance variables
    String sentence = "";
    String wordToDelete = "";
    int position = 0;

    // In the function input() we accept the sentence, word and position
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        sentence = sc.nextLine();

        // Check if sentence ends with valid terminator
        char lastChar = sentence.charAt(sentence.length() - 1);
        if (lastChar != '.' && lastChar != '?' && lastChar != '!') {
            System.out.println("INVALID INPUT.");
            System.exit(0);
        }

        System.out.println("Enter the word to be deleted: ");
        wordToDelete = sc.next();
        System.out.println("Enter the position of the word: ");
        position = sc.nextInt();
    }

    // In the function process() we normalize and delete the word
    void process() {
        // Normalize sentence - reduce extra spaces
        String normalized = "";
        boolean previousSpace = false;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (currentChar == ' ') {
                if (!previousSpace && !normalized.isEmpty() && i < sentence.length() - 1) {
                    normalized += currentChar;
                    previousSpace = true;
                }
            } else {
                normalized += currentChar;
                previousSpace = false;
            }
        }

        // Delete word at specified position
        String result = "";
        String currentWord = "";
        int wordCount = 0;
        char terminator = normalized.charAt(normalized.length() - 1);

        for (int i = 0; i < normalized.length() - 1; i++) {
            char currentChar = normalized.charAt(i);

            if (currentChar == ' ') {
                if (!currentWord.isEmpty()) {
                    wordCount++;
                    if (wordCount != position) {
                        result += currentWord + " ";
                    }
                    currentWord = "";
                }
            } else {
                currentWord += currentChar;
            }
        }

        // Handle last word
        if (!currentWord.isEmpty()) {
            wordCount++;
            if (wordCount != position) {
                result += currentWord + " ";
            }
        }

        // Add terminator and display
        result = result.trim() + terminator;
        System.out.println("OUTPUT: " + result);
    }

    // In the main method we create an object and call the required functions
    public static void main(String[] args) {
        Program22 obj = new Program22();
        obj.input();
        obj.process();
    }
}
