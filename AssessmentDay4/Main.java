package AssessmentDay4;

public class Main {
    public static void main(String[] args) {
        // INTERFACE METHODS
        Database dbo = new Oracle();
        dbo.connection();

        Database dbsql = new MySQL();
        dbsql.connection();

        System.out.println("-----");

        // ABSTRACT CLASS METHODS
        CustomFile file1 = new Pdf();
        CustomFile file2 = new Jpg();

        file1.readFile();
        file2.readFile();

        System.out.println(file1.getExtension());
        System.out.println(file2.getExtension());
    }
}