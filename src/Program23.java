/*
A simple encryption system uses a shifting process to hide a message. The value of the shift can be in the range 1 to 26. 

For example a shift of 7 means that A = U, B =V,C = W, etc.i e.
Text : A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Code: U V W X Y Z A B C D E F G H I J K L M N O P Q R S T

Fist an extra space is added to the end of the string. To make things little more difficult, spaces within the original text are replaced with QQ before the text is encrypted. Double Q (QQ) was selected because no English word ends in Q or contains QQ. 
Additionally, the coded message is printed in blocks of six characters separated by spaces. The last block might not contain six characters. Write a program that takes the coded text (less than 100 characters), the shift value and prints the decoded original text.Your program must reject any non-valid value for shift and display an error message “INVALID SHIFT VALUE”. Assume all characters are upper case. Test your program for the following data and some data that you have coded, using the rules given above:

SAMPLE DATA: 

INPUT:
CODED TEXT : “UHINBY LKKQCH HYLKK”
SHIFT : 7
OUTPUT:
DECODED TEXT : ANOTHER WINNER
INPUT:
CODED TEXT : “RUIJGG EVGGBK SAGG”
SHIFT : 11
OUTPUT:
DECODED TEST : BEST OF LUCK 
INPUT:
CODED TEXT : “DKSMMW NAMMUK QMM”
SHIFT : 29
OUTPUT:
INVALID SHIFT VAULE 
 */

import java.util.Scanner;

class Program23 {
    // Declaration of instance variables
    String codedText = "";
    int shift = 0;

    // In the function input() we accept the coded text and shift value
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coded text: ");
        codedText = sc.nextLine();
        System.out.println("Enter shift value: ");
        shift = sc.nextInt();
    }

    // In the function decode() we validate shift, decode and display the message
    void decode() {
        // Validate shift
        if (shift < 1 || shift > 26) {
            System.out.println("INVALID SHIFT VALUE");
            return;
        }

        // Remove spaces from coded text
        String cleanedText = "";
        for (int i = 0; i < codedText.length(); i++) {
            if (codedText.charAt(i) != ' ') {
                cleanedText += codedText.charAt(i);
            }
        }

        // Decode each character by reversing the shift
        String decoded = "";
        for (int i = 0; i < cleanedText.length(); i++) {
            char currentChar = cleanedText.charAt(i);
            char decodedChar = (char) (currentChar - (26 - shift + 1));

            // If we go below 'A', wrap around
            while (decodedChar < 'A') {
                decodedChar += 26;
            }

            decoded += decodedChar;
        }

        // Remove trailing space
        decoded = decoded.trim();

        // Replace QQ with spaces
        String decodedText = "";
        for (int i = 0; i < decoded.length(); i++) {
            if (i < decoded.length() - 1 && decoded.charAt(i) == 'Q' && decoded.charAt(i + 1) == 'Q') {
                decodedText += " ";
                i++;
            } else {
                decodedText += decoded.charAt(i);
            }
        }

        decodedText = decodedText.trim();
        System.out.println("DECODED TEXT: " + decodedText);
    }

    // In the main method we create an object and call the required functions
    public static void main(String[] args) {
        Program23 obj = new Program23();
        obj.input();
        obj.decode();
    }
}

