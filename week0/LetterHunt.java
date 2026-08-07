package STEP.week1;
import java.util.Scanner;
public class LetterHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char targetLetter;
        int count;
        for (int i = 0; i < input.length(); i++) {
            targetLetter = input.charAt(i);
            count=0; //reseting for each char
            for(int j = 0; j < input.length(); j++) {
                if(i!=j && input.charAt(j) == targetLetter) {
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.println("The first non-repeating letter is: " + targetLetter);
                break;
            }
        }
        sc.close();
    }
}
