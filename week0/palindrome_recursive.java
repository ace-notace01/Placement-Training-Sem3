package STEP.week1;
public class palindrome_recursive {
    public static void main(String[] args) {
        String word = "madam";
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String word, int start, int end) {
        if (word == null) {
            return false;
        }
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }
}