package AssessmentDay9.databases;

import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

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

    void disconnectDB() throws SQLException {
        this.dbConnection.close();
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

    void updateRecord(Employee employee) throws SQLException {
        Statement statement = this.dbConnection.createStatement();

        String sqlQuery = "UPDATE employee SET name='"
                + employee.getName()
                + "', address='" + employee.getAddress()
                + "', salary='" + employee.getSalary()
                + "'"
                + " where id=" + employee.getId() + ";";

        System.out.println("Executing following QUERY");
        System.out.println(sqlQuery);
        int result = statement.executeUpdate(sqlQuery);

        if (result == 1) {
            System.out.println("----\n\rSuccess");
        } else {
            System.out.println("----\n\rFailed");
        }

        System.out.println("----\n\rListing out all records");
        this.listRecord();
    }
}
