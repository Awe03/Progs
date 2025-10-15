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
DECODED TEXT : ANOTHER VALUE 
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

