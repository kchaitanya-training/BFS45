package com.employee.processor;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.EncryptedDocumentException;

import com.employee.service.EmployeeService;

public class Processor {

	public static void main(String[] args) throws ClassNotFoundException, 
							EncryptedDocumentException, IOException, SQLException  {
		
		EmployeeService empservice = new EmployeeService();
		File file = new File("D:\\bootcamp\\ExcelPractice\\src\\Employee.xlsx");
		empservice.readExcelFile(file);
	}
}
