package week2_live;
import java.util.*;

public class BankTransactionReferenceGeneratorValidator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a bank transaction reference: ");
        String reference = sc.nextLine();
        System.out.println();
        reference = normalizeReference(reference);
        reference = validateAndFormat(reference);
        if(reference != null){
            System.out.println("Formatted reference: " + reference);
        }
    }
    static String normalizeReference(String reference){
        reference = reference.trim();
        for(int i=0; i<3;i++){
            char ch=reference.charAt(i);
            if(Character.isLetter(ch)){
                reference=reference.replace(ch,Character.toUpperCase(ch));
            }else{
                System.out.println("Invalid reference format");
                return null;
            }
        }
        return reference;
    }

    static String validateAndFormat(String reference){
        if(reference.length() != 14){
            System.out.println("Invalid reference length");
            return null;
        }
        for(int i=0; i<3;i++){
            char ch=reference.charAt(i);
            if(Character.isLetter(ch)){
                reference=reference.replace(ch,Character.toUpperCase(ch));
            }else{
                System.out.println("Invalid reference format");
                return null;
            }
        }
        for(int i=3; i<14;i++){
            char ch=reference.charAt(i);
            if(Character.isDigit(ch)){
                continue;
            }else{
                System.out.println("Invalid reference format");
                return null;
            }
        }
        return ("[" + reference.substring(0, 3) + "] DATE: " + reference.substring(3, 5) + "/" + reference.substring(5, 7) + "/"
                + reference.substring(7, 9) + " SEQ: " + reference.substring(9));
    }
}
