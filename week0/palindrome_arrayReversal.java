package STEP.week1;
import java.util.Scanner;

public class palindrome_arrayReversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        char[] arr = word.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Reverse the character array
        while (start < end) {

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        String reversed = new String(arr);

        System.out.println("Original String : " + word);
        System.out.println("Reversed String : " + reversed);

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}