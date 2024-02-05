package com.employee.service;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;

public class EmployeeService {

	EmployeeDao empDao;
	public void readExcelFile(File file) throws EncryptedDocumentException, IOException, ClassNotFoundException, SQLException{
		
		FileInputStream inFile = null;
		if(file.getName().contains("Employee")) {
			inFile = new FileInputStream(file);
			System.out.println(inFile);
			Workbook workbook = WorkbookFactory.create(inFile);
			Sheet sheet = workbook.getSheet("Employee");
			System.out.println(sheet);

			if (sheet != null) {
			    for (Row row : sheet) {
			    	if(row.getRowNum()!=0) {
						Employee emp = new Employee((int)row.getCell(0).getNumericCellValue(),
										String.valueOf(row.getCell(1)),
										String.valueOf(row.getCell(2)),
										(int)row.getCell(3).getNumericCellValue());
						empDao.saveEmployees(emp);
						inFile.close();				
					}
			    }
			} else {
			    System.out.println("Sheet with name 'employee' not found in the workbook");
			}
		}else {
			System.out.println("Wrong file;");
		}
	}
}
