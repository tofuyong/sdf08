package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReader {

    public List<Employee> readCSV () throws IOException {

        Path filePath = Paths.get("./data/employee.txt");
        File csvFile = filePath.toFile();

        if (csvFile.exists()){
            System.out.println("File exists");
        } else {
            System.out.println("File doesn't exist");
        }
        
        FileReader fr = new FileReader(csvFile);
        BufferedReader br = new BufferedReader(fr);

        List <Employee> employeeList = new ArrayList<>();
        
        String line = br.readLine(); //to skip reading the top line

        while ((line = br.readLine()) !=null) {
            String[] employee = line.trim().split(",");
            Employee emp = new Employee(employee[0], employee[1], employee[2], employee[3], employee[4], Integer.parseInt(employee[5]));
            employeeList.add(emp);
            
        }
        br.close();
        fr.close();

        return employeeList;
    }

    
}
