package com.employee.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.employee.dao.EmployeeDao;
import com.employee.model.Employee;

public class EmployeeService {

	EmployeeDao empDao;
	
	public void readExcelFile(File file) throws EncryptedDocumentException, IOException, ClassNotFoundException, SQLException{
		
		if(file.getName().contains("Employee")) {
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet("Employee");

			empDao = new EmployeeDao();
	
		    for (Row row : sheet) {
		    	if(row.getRowNum()!=0) {
                    if (row.getCell(0) == null || row.getCell(0).getCellType() == CellType.BLANK) {
                        // Break the loop if the first cell of the current row is empty
                        break;
                    }
					Employee emp = new Employee(
									(int)row.getCell(0).getNumericCellValue(),
									String.valueOf(row.getCell(1)),
									String.valueOf(row.getCell(2)),
									(int)row.getCell(3).getNumericCellValue());
					empDao.saveEmployees(emp);
				}
		    }
		}
	}
	
}
