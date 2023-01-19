package sdf;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";
    public List<Employee> employees = null;

    // Function to generate new employee array list
    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        // Create some employees
        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer",
                "darrylng@nus.edu.sg", 20000);
        Employee emp2 = new Employee("23456", "Andrea Yong", "FNN", "Teacher",
                "andreay@nus.edu.sg", 30000);
        Employee emp3 = new Employee("34567", "Lim Moy Hoon", "Management", "Princpal",
                "lmh@nus.edu.sg", 40000);

        // Add employees to list of employees
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        // Write FILE_HEADER to CSV
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);

        // Read records row by row and write it using fw.append()
        for (Employee e : employees) {
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(NEWLINE_SEPERATOR);
        }
        fw.flush();
        fw.close();
    }

}
