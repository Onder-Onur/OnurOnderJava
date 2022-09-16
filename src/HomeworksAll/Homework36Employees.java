package HomeworksAll;

import java.util.Comparator;

public class Homework36Employees {
    //Write code with followings
    //Write Employee Class where it has Int "Employee Id", String "Employee Name" and double "Employee Salary"
    //Write a code where It ask user to enter Employee ID, Employee Name and Employee Salary where anytime user creates a new object of Employee Class.

    int EmployeeID;
    String  EmployeeName;
    double EmployeeSalary;

    public Homework36Employees(int employeeID, String employeeName, double employeeSalary){
        this.EmployeeID=employeeID;
        this.EmployeeName=employeeName;
        this.EmployeeSalary=employeeSalary;
    }

    public Homework36Employees(){
    }


    public String toString(){
        String result = "Employee Id: " + EmployeeID + "\nEmployee Name: " + EmployeeName + "\nEmployee Salary: " + EmployeeSalary +"\n";
        return result;
    }
}


