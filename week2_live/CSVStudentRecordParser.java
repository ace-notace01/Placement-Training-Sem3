package week2_live;

public class CSVStudentRecordParser {

    public static void main(String[] args) {
        String csvLine = "John Doe,20,Computer Science";
        parseStudentRecord(csvLine);
    }
    static void parseStudentRecord(String csvLine) {
    String[] fields = csvLine.split(",");
    if(fields.length != 3) {
        System.out.println("Invalid Record!");
        return;
    }
    String name = fields[0];
    int age = Integer.parseInt(fields[1]);
    String major = fields[2];
    
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Major: " + major);
    return;
}

    
}
