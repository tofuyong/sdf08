package sdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortExample {

    public void example01(){
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100)); //Math.random returns a double, number is between 0 - 100, arraylist is int, so cast is needed
        }

        // Print out unsorted list
        System.out.println("Unsorted list: " + numbers);

        // Sort in ascending & print
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Sort in descending & print
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted list (reverse): " + numbers);
    }

    public void example02(){
        Integer numbers [] = {10, 5, 1, 2, 3, 6, 4, 7, 9, 8};
        // int[] numbers = {10, 5, 1, 2, 3, 6, 4, 7, 9, 8};

        // sort number array in ascending order & print
        Arrays.sort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // sort number array in reverse order & print
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

    }
    
    public void example03() {
        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", 
        "darrylng@nus.edu.sg", 20000);
        Employee emp2 = new Employee("23456", "Andrea Yong", "FNN", "Teacher", 
        "andreay@nus.edu.sg", 30000);
        Employee emp3 = new Employee("34567", "Lim Moy Hoon", "Management", "Princpal", 
        "lmh@nus.edu.sg", 40000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Print out employees list before sorting
        System.out.println("employees before sorting: " + employees);

        // Do an ascending sort using Collections & print
        Collections.sort(employees);
        System.out.println("employees after sorting: " + employees);

        // Sorting using Comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employees (salary): " + employees);
        
        // Using Lambdas to filter
        List <Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("darryl ng")).collect(Collectors.toList());
        System.out.println("Filtered employees: " + filteredEmployees);

    }
}
