package sdf;

public class Employee implements Comparable<Employee>{
    private String staffNo;
    private String fullName;
    private String department;
    private String role;
    private String emailAddress;
    private int salary;

    //Constructors
    public Employee(String staffNo, String fullName, String department, String role, String emailAddress, int salary) {
        this.staffNo = staffNo;
        this.fullName = fullName;
        this.department = department;
        this.role = role;
        this.emailAddress = emailAddress;
        this.salary = salary;
    }

    //Getters & Setters
    public String getStaffNo() {
        return staffNo;
    }
    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //To String
    @Override
    public String toString() {
        return "Employee [staffNo=" + staffNo + ", fullName=" + fullName + ", department=" + department + ", role="
                + role + ", emailAddress=" + emailAddress + ", salary=" + salary + "]";
    }

    //Compare To method
    @Override
    public int compareTo(Employee o) {
        return this.getFullName().compareTo(o.getFullName());
    }



    
    public void example02() {

    }

    
}
