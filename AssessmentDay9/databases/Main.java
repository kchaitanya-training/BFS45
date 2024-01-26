package AssessmentDay9.databases;

import java.util.List;
import java.util.ArrayList;
import java.sql.SQLException;

public class Main {
    DatabaseOperations db;

    Main(DatabaseOperations db) {
        this.db = db;
    }

    void createAndInsert() throws SQLException {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Tom", "CA", 10000.0f));
        employees.add(new Employee(2, "Mark", "CA", 10000.0f));
        employees.add(new Employee(3, "Travis", "CA", 10000.0f));

        this.db.insertRecord(employees);
    }

    void updateRecord() throws SQLException {
        Employee em = new Employee(1, "Tom", "CA", 50000.45f);

        this.db.updateRecord(em);
    }

    public static void main(String[] args) {
        DatabaseOperations db = new DatabaseOperations("takeo", "root");
        Main m = new Main(db);

        try {
            db.connectDB();

            db.listRecord();

            // m.createAndInsert();
            // m.updateRecord();

            db.disconnectDB();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}