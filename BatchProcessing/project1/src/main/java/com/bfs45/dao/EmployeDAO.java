package com.bfs45.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bfs45.model.Employee;
import com.bfs45.util.DatabaseConnection;

public class EmployeDAO {
    Connection dbConnection;
    DatabaseConnection db;

    public EmployeDAO(String dbName, String dbUser, String dbPassword) throws ClassNotFoundException, SQLException {
        this.db = new DatabaseConnection(dbName, dbUser, dbPassword);
        this.dbConnection = this.db.getDbConnection();
    }

    public List<Employee> listRecord() throws SQLException {
        Statement statement = this.dbConnection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM employee");

        List<Employee> empList = new ArrayList<Employee>();
        while (result.next()) {
            int id = Integer.valueOf(result.getString(1));
            String name = result.getString(2);
            String address = result.getString(3);
            float salary = Float.valueOf(result.getString(4));

            empList.add(new Employee(id, name, address, salary));
        }

        statement.close();

        return empList;
    }

    public void insertRecord(
            List<Employee> employees) throws SQLException {

        PreparedStatement pStatement = this.dbConnection
                .prepareStatement("INSERT INTO employee(id, name, address, salary) VALUES (?,?,?,?)");

        for (Employee employee : employees) {
            pStatement.setInt(1, employee.getId());
            pStatement.setString(2, employee.getName());
            pStatement.setString(3, employee.getAddress());
            pStatement.setFloat(4, employee.getSalary());

            pStatement.execute();
        }
    }

    public void updateRecord(Employee employee) throws SQLException {
        Statement statement = this.dbConnection.createStatement();

        String sqlQuery = "UPDATE employee SET name='"
                + employee.getName()
                + "', address='" + employee.getAddress()
                + "', salary='" + employee.getSalary()
                + "'"
                + " WHERE id=" + employee.getId() + ";";

        statement.executeUpdate(sqlQuery);
    }

    public void deleteRecord(
            Employee employee) throws SQLException {

        Statement statement = this.dbConnection.createStatement();

        String sqlQuery = "DELETE FROM employee WHERE id=" + employee.getId() + ";";

        statement.executeUpdate(sqlQuery);
    }
}
