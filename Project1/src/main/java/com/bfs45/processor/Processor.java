package com.bfs45.processor;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.EncryptedDocumentException;

import com.bfs45.service.EmployeeService;

public class Processor {

	public static void main(String[] args) {
		
		EmployeeService empService = new EmployeeService();
		// Read file
		File file = new File("C:\\Users\\sonam\\bfs45_workspace\\employee.xlsx");
			try {
				empService.readFromExcel(file); // pass file to empDao method.
			} catch (EncryptedDocumentException | IOException | ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}

	}

}
