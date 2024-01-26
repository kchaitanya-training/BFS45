package AssessmentDay9.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseOperations {
    String dbName;
    String dbUser;

    Connection dbConnection;

    DatabaseOperations(String dbName, String dbUser) {
        this.dbName = dbName;
        this.dbUser = dbUser;
    }

    void connectDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        this.dbConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/" + this.dbName, // DATABASE URL
                this.dbUser, // DATABASE USER USERNAME
                GetDBPassword.dbPassword()); // DATABASE USER PASSWORD
    }

    void listRecord() throws SQLException {
        Statement statement = this.dbConnection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM employee");

        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String address = result.getString(3);
            String salary = result.getString(4);

            System.out.println("----");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Salary: " + salary);
        }

        System.out.println("----");

        statement.close();
    }

    void insertRecord(
            List<Employee> employees) throws SQLException {

        PreparedStatement pStatement = this.dbConnection
                .prepareStatement("INSERT INTO employee(id, name, address, salary) VALUES (?,?,?,?)");

        for (Employee employee : employees) {
            System.out.println("Inserting " + employee.getName());
            pStatement.setInt(1, employee.getId());
            pStatement.setString(2, employee.getName());
            pStatement.setString(3, employee.getAddress());
            pStatement.setFloat(4, employee.getSalary());

            pStatement.execute();
        }
    }
}
