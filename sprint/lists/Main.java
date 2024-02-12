package sprint.lists;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* 
 * Convert List to Map
 */

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "John"),
                new Employee(102, "Harry"),
                new Employee(103, "Ron"));

        Map<Integer, Employee> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(Employee::getEmpId, emp -> emp));

        employeeMap.forEach((empId, employee) -> System.out
                .println("Employee ID: " + empId + ", Employee Name: " + employee.getEmpName()));
    }

}

class Employee {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }
}
