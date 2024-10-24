package ch.hatbe.juventus.recursion;

public class Rec {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Korb"));
        System.out.println(isPalindrome("Bob"));
        System.out.println(isPalindrome("Mein Computer"));
        System.out.println(isPalindrome("Level"));
        System.out.println(isPalindrome("Fuss"));
        System.out.println(isPalindrome("Anna Bob Anna"));
        System.out.println(isPalindrome("Kamel"));
        System.out.println(isPalindrome("Stein"));
        System.out.println(isPalindrome("!+Level+!"));
    }
}
