package week2_live;
import java.util.Scanner;

public class FileExtensionValidator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = sc.nextLine();
        System.out.println(validateFileExtension(fileName));
        sc.close();
    }

    static String validateFileExtension(String fileName) {
        //using last index of and substring to find the file extension
        int lastDotIndex = fileName.lastIndexOf('.'); //returns the index of the last occurrence of the specified character in the string, or -1 if the character does not occur.
        if (lastDotIndex != -1) {
            String fileExtension = fileName.substring(lastDotIndex);
            String[] validExtensions = {".pdf", ".docx", ".zip"};
            for (String ext : validExtensions) {
                if (fileExtension.equalsIgnoreCase(ext)) {
                    return "Accepted";
                }
            }
        }
        return "Rejected-Invalid file type";
    }
}