package com.bfs45.processor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

import com.bfs45.model.Employee;
import com.bfs45.service.EmployeeService;

public class Processor {

    EmployeeService empService;
    List<Employee> empList = new ArrayList<Employee>();

    Processor(String dbName, String dbUser, String dbPassword) throws ClassNotFoundException, SQLException {
        this.empService = new EmployeeService(dbName, dbUser, dbPassword);
    }

    void readEmployee() throws EncryptedDocumentException, ClassNotFoundException, IOException, SQLException {
        // READ FROM EXCEL
        System.out.println("Reading from 'employee.xlsx'");
        this.empList = this.empService.readFromExcel();

        System.out.println("----\n\rData from Excel file\n\r----");
        for (Employee e : this.empList) {
            System.out.println("ID: " + e.getId());
            System.out.println("Name: " + e.getName());
            System.out.println("Address: " + e.getAddress());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("----");
        }
    }

    void listEmployee() {
        // LIST
        System.out.println("----\n\rReading from database\n\r----");
        for (Employee e : this.empList) {
            System.out.println("ID: " + e.getId());
            System.out.println("Name: " + e.getName());
            System.out.println("Address: " + e.getAddress());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("----");
        }
    }

    void insertEmployee() {
        // INSERT
        System.out.println("Inserting into database...");

        this.empService.insertEmployee();
        this.empList = this.empService.updateThisEmpList();

        this.listEmployee();
    }

    void updateEmployee() {
        // UPDATE
        System.out.println("Updating employee with ID 2001...");

        Employee newEmp = new Employee(2001, "Tom", "CA", 50000.45f);
        this.empService.updateEmployee(newEmp);
        this.empList = this.empService.updateThisEmpList();

        this.listEmployee();
    }

    void deleteEmployee() {
        // DELETE
        System.out.println("Deleting employee with ID 2001...");

        Employee employee = new Employee(2001, "Tom", "CA", 50000.45f);
        this.empService.deleteEmployee(employee);
        this.empList = this.empService.updateThisEmpList();

        this.listEmployee();
    }

    public static void main(String[] args) {
        String dbName = "takeo"; // ENTER THE DATABASE NAME
        String dbUser = "root"; // ENTER THE DATABASE USER USERNAME
        String dbPassword = "root"; // ENTER THE DATABASE USER PASSWORD

        System.out.println("---- Project1 ----");
        System.out.println("Database Name: " + dbName);
        System.out.println("Database User Username: " + dbUser);
        System.out.println("Database User Password: " + dbPassword);
        System.out.println("----");

        try {
            Processor driver = new Processor(dbName, dbUser, dbPassword);

            // READ
            driver.readEmployee();

            // INSERT AND LIST
            driver.insertEmployee();

            // UPDATE AND LIST
            driver.updateEmployee();

            // DELETE AND LIST
            driver.deleteEmployee();
        } catch (EncryptedDocumentException | IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
