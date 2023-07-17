// Write a program to print the following patterns
// i)
// H
// HE
// HEL
// HELL
// HELLO
class P23i {
    public static void main(String[] args) {
        String str = "HELLO";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0, i + 1));
        }
    }
}

// ii)
// HELLO
// ELLO
// LLO
// LO
// O
class P23ii {
    public static void main(String[] args) {
        String str = "HELLO";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(i));
        }
    }
}