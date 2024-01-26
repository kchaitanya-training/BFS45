package AssessmentDay9.databases;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;

public class Main {
    void createAndInsert(DatabaseOperations db) throws SQLException {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Tom", "CA", 10000.0f));
        employees.add(new Employee(2, "Mark", "CA", 10000.0f));
        employees.add(new Employee(3, "Travis", "CA", 10000.0f));

        db.insertRecord(employees);
    }

    public static void main(String[] args) {
        DatabaseOperations db = new DatabaseOperations("takeo", "root");

        try {
            db.connectDB();

            db.listRecord();

            db.disconnectDB();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}