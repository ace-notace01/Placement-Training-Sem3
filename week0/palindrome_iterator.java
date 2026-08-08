package week0;
public class palindrome_iterator {
    public static void main(String[] args) {

        String word = "madam";

        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {

        if (word == null) {
            return false;
        }

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}