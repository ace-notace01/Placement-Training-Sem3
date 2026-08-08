//accept the number as a string and use string builder to convert it to numeric and mask the last 4 digits and return the masked number with a seperator - between the masked and unmasked digits.
package week2_live;
import java.util.Scanner;

public class MaskedPhoneNumberFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println(maskPhoneNumber(phoneNumber));
        sc.close();
    }

    static String maskPhoneNumber(String phoneNumber) {
        StringBuilder maskedNumber = new StringBuilder();
        //validate if all the characters in the string are digits
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                return "Invalid phone number";
            }
        }
        // Mask all but the last 4 digits
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (i < phoneNumber.length() - 4) {
                maskedNumber.append('x');
            } else {
                maskedNumber.append(phoneNumber.charAt(i));
            }
        }
        // Insert the separator between the masked and unmasked parts
        if (phoneNumber.length() > 4) {
            maskedNumber.insert(phoneNumber.length() - 4, '-');
        }
        return maskedNumber.toString();    
}
    
}
