package com.bfs45.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.bfs45.dao.EmployeDAO;
import com.bfs45.model.Employee;

public class EmployeeService {
    EmployeDAO empDao;

    List<Employee> empList = new ArrayList<Employee>();

    public EmployeeService(String dbName, String dbUser, String dbPassword)
            throws ClassNotFoundException, SQLException {
        this.empDao = new EmployeDAO(dbName, dbUser, dbPassword);
    }

    InputStream getExcelFile() throws FileNotFoundException {
        String filePath = new File("employee.xlsx").getAbsolutePath();

        return new FileInputStream(filePath);
    }

    public List<Employee> readFromExcel()
            throws EncryptedDocumentException, IOException, ClassNotFoundException, SQLException {

        InputStream excelFile = this.getExcelFile();
        Workbook wbook = WorkbookFactory.create(excelFile);
        Sheet sheet = wbook.getSheet("employee");

        for (Row row : sheet) {
            if (row.getRowNum() != 0) {
                Employee emp = new Employee(
                        (int) row.getCell(0).getNumericCellValue(), // ID
                        String.valueOf(row.getCell(1)), // NAME
                        String.valueOf(row.getCell(3)), // ADDRESS
                        (float) row.getCell(2).getNumericCellValue() // SALARY
                );

                this.empList.add(emp);
            }

        }

        return this.empList;
    }

    public int insertEmployee() {
        if (this.empList.isEmpty()) {
            return -1;
        }

        try {
            this.empDao.insertRecord(this.empList);
        } catch (Exception e) {
            System.out.println("Error caught on Employee Service");
            e.printStackTrace();
            return 0;
        }

        return 1;
    }

    public void updateEmployee(Employee employee) {
        try {
            this.empDao.updateRecord(employee);
        } catch (Exception e) {
            System.out.println("Error caught on Employee Service");
            e.printStackTrace();
        }

    }

    public void deleteEmployee(Employee employee) {
        try {
            this.empDao.deleteRecord(employee);
        } catch (Exception e) {
            System.out.println("Error caught on Employee Service");
            e.printStackTrace();
        }

    }

    public List<Employee> listEmployee() {

        List<Employee> dbEmpList = new ArrayList<Employee>();

        try {
            dbEmpList = this.empDao.listRecord();
        } catch (SQLException e) {
            System.out.println("Error caught on Employee Service");
            e.printStackTrace();
        }

        return dbEmpList;
    }

    public List<Employee> updateThisEmpList() {
        // UPDATE THE EMP LIST FROM DATABASE
        this.empList = this.listEmployee();

        return this.empList;
    }

    public EmployeDAO getEmpDao() {
        return this.empDao;
    }

    public List<Employee> getEmpList() {
        return empList;
    }
}
