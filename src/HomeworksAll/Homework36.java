package HomeworksAll;

import java.util.Scanner;

public class Homework36 {
    //Write code with followings
    //Write Employee Class where it has Int "Employee Id", String "Employee Name" and double "Employee Salary"
    //Write a code where It ask user to enter Employee ID, Employee Name and Employee Salary where anytime user creates a new object of Employee Class.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the Employee Name");
        String empName = sc.nextLine();
        System.out.println("Please enter the Employee Id");
        int empId = sc.nextInt();
        System.out.println("Please enter the Employee Salary");
        double empSalary = sc.nextDouble();

        Homework36Employees emp1 = new Homework36Employees(empId,empName,empSalary);

        System.out.println(emp1.toString());


    }
}
