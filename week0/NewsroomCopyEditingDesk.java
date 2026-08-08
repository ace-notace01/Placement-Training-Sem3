package week0;

import java.util.Scanner;

public class NewsroomCopyEditingDesk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String s = sc.nextLine();

        String[] result = findShortestandLongestWord(s);

        System.out.println("The shortest word is: " + result[0] +
                " and its length is: " + result[0].length());

        System.out.println("The longest word is: " + result[1] +
                " and its length is: " + result[1].length());

        sc.close();
    }

    public static String[] findShortestandLongestWord(String s) {
        String[] words = s.split("\\s+"); // Split the sentence into words using one or more whitespace characters as the delimiter

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) { //"for each loop" word in the array of words, check if it is shorter or longer than the current shortest and longest words, respectively. If it is, update the shortest or longest word accordingly.
            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return new String[]{shortest, longest};
    }
}