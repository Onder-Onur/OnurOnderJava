package HomeworksAll;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Homework37 extends Homework36Employees{
    //Use Employee Class on the Homework 36 and write code where
    //It crates Employee Objects unless User choose to stop creating employee objects and add all the created Employee object to ArrayList.
    //- Write a Method where it takes ArrayList of Employees and returns to shorted ArrayList of Employee based on the Salary.
    // (Increasing order, Lowest first and so on)
    //- Write a method where It takes arrayList of Employee and Returns to ArrayList of Strings where it contains the Name of Employees
    //- Write a Method where it takes arrayList of Employees and return to the ArrayList of employees that has even Number Employee ID
    //- Write a Method Where takes ArrayList of Employees where it returns the count of employees who has Salary of 50k or more.
    //- Write a Method Where it takes ArrayList of Employees and Returns to Total of Salaries in the List
    //- Write a Method Where it takes ArrayList of Employees, Calculates a Annual Bonus for Employee and Prints the Employee Name
    // and the Amount of Bonus they will be receiving ( Bonus = 15% of salary)
    //- Write a Method where it Takes ArrayList of Employee and 2 integer values where they represent the index,
    // and Swap the employees on the given index and print the index of swapped employees and their names.
    //PS : you can have all those methods on the same Class if you would like to
    // and have Screenshot of each method posted here along with your whole code. That is normally would count for 7 Homework :)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Homework36Employees> employees = new ArrayList<>();
//        //Method trials code starts here
//        Homework36Employees employees1 = new Homework36Employees();
//        employees1.EmployeeName = "Onur Onder";
//        employees1.EmployeeID = 1;
//        employees1.EmployeeSalary = 40000;
//
//        Homework36Employees employees2 = new Homework36Employees();
//        employees2.EmployeeName = "Cevdet Efe";
//        employees2.EmployeeID = 2;
//        employees2.EmployeeSalary = 150000;
//
//        Homework36Employees employees3 = new Homework36Employees();
//        employees3.EmployeeName = "Cenkay Aycenk";
//        employees3.EmployeeID = 3;
//        employees3.EmployeeSalary = 130000;
//
//        employees.addAll(Arrays.asList(employees1,employees2,employees3));
        //Methods trials code ends

        int extProgram = 1;
        int loopQuestion;

        while (extProgram == 1) {
            Homework36Employees employee = new Homework36Employees();
            employees.add(employee);

            System.out.println("Please enter the Employee Name");
            employee.EmployeeName = sc.nextLine();
            System.out.println("Please enter the Employee Id");
            employee.EmployeeID = sc.nextInt();
            System.out.println("Please enter the Employee Salary");
            employee.EmployeeSalary = sc.nextDouble();
            sc.nextLine();

            System.out.println("Dou you want to add more employee? 1 for yes, 2 for no");
            loopQuestion = sc.nextInt();
            if (loopQuestion == 2) {
                extProgram = 2;
            } else {
                sc.nextLine();
            }

        }
        System.out.println("The list of Employees\n");
        String result = employees.toString();
        System.out.println(result);
        System.out.println("The employee list that sorted by their salary\n");
        SortedBySalary(employees);
        System.out.println("Names of employees\n");
        System.out.println(NamesOfEmployees(employees));
        System.out.println("The employees wyih even EmployeeID\n");
        System.out.println(EvenEmployeeID(employees));
        System.out.println("Employees who gets 50k and more\n");
        System.out.println(HigherThan50(employees));
        System.out.println("Total salary of all employees\n");
        System.out.println("The total salary is: "+TotalSalary(employees));
        System.out.println("Anual Bonus Salary\n");
        System.out.println(CalculateBonus(employees));
        System.out.println("Swap Employee\n");
        System.out.println(SwapEmployees(employees, 0, 2));


    }

    public static void Test(){

    }

    //- Write a Method where it takes ArrayList of Employees and returns to shorted ArrayList of Employee based on the Salary.
    // (Increasing order, Lowest first and so on)
    public static ArrayList<Homework36Employees> SortedBySalary(ArrayList<Homework36Employees> arrayList){
        ArrayList<Homework36Employees> sortedBySalary = arrayList;
        Homework36Employees tmp = sortedBySalary.get(0);

        for (int i = 0; i < sortedBySalary.size(); i++) {
            for (int j = sortedBySalary.size() - 1; j > i; j--) {
                if (sortedBySalary.get(i).EmployeeSalary > sortedBySalary.get(j).EmployeeSalary) {
                    tmp = sortedBySalary.get(i);
                    sortedBySalary.set(i,sortedBySalary.get(j));
                    sortedBySalary.set(j,tmp);
                }
            }
        }


        String result = sortedBySalary.toString();
        System.out.println(result);
        return sortedBySalary;

    }

    //- Write a method where It takes arrayList of Employee and Returns to ArrayList of Strings where it contains the Name of Employees
    public static ArrayList<String> NamesOfEmployees(ArrayList<Homework36Employees> arrayList){
        ArrayList<String> namesOfEmployees = new ArrayList<String>();
        for (Homework36Employees obj:arrayList) {
            namesOfEmployees.add(obj.EmployeeName);
        }
        return namesOfEmployees;
    }

    //- Write a Method where it takes arrayList of Employees and return to the ArrayList of employees that has even Number Employee ID
    public static ArrayList<Homework36Employees> EvenEmployeeID(ArrayList<Homework36Employees> arrayList){
        ArrayList<Homework36Employees> evenEmployeeID = new ArrayList<Homework36Employees>();
        for (Homework36Employees obj:arrayList) {
            if (obj.EmployeeID%2==0){
                evenEmployeeID.add(obj);
            }else{
                continue;
            }

        }
        return evenEmployeeID;
    }
    //- Write a Method Where takes ArrayList of Employees where it returns the count of employees who has Salary of 50k or more.
    public static String HigherThan50(ArrayList<Homework36Employees> arrayList){
        int count =0;
        for (Homework36Employees obj:arrayList) {
            if (obj.EmployeeSalary>50000){
                count+=1;
            }else{
                continue;
            }

        }
        return "The number of employees with higher than 50k is: " + count;
    }
    //- Write a Method Where it takes ArrayList of Employees and Returns to Total of Salaries in the List
    public static Double TotalSalary(ArrayList<Homework36Employees> arrayList){
        double totalSalary =0;
        for (Homework36Employees obj:arrayList) {
           totalSalary+= obj.EmployeeSalary;
        }
        return totalSalary;
    }
    //- Write a Method Where it takes ArrayList of Employees, Calculates a Annual Bonus for Employee and Prints the Employee Name
    // and the Amount of Bonus they will be receiving ( Bonus = 15% of salary)
    public static String  CalculateBonus(ArrayList<Homework36Employees> arrayList){
        String totalBonus ="";
        for (Homework36Employees obj:arrayList) {
            totalBonus += obj.EmployeeName + " will get "+ obj.EmployeeSalary*0.15 + " total bonus this year. \n";
        }
        return totalBonus;
    }

    //- Write a Method where it Takes ArrayList of Employee and 2 integer values where they represent the index,
    // and Swap the employees on the given index and print the index of swapped employees and their names.
    public static ArrayList<Homework36Employees>  SwapEmployees(ArrayList<Homework36Employees> arrayList,int a,int b){
        ArrayList<Homework36Employees> swapEmployees = arrayList;
        Homework36Employees tmp = swapEmployees.get(a);
        swapEmployees.set(a,swapEmployees.get(b));
        swapEmployees.set(b,tmp);

        System.out.println("The employee on the index of "+ a+" "+ arrayList.get(b).EmployeeName+ " Change the spot with the index of " + b +" "+ arrayList.get(a).EmployeeName);
        return swapEmployees;
    }



}
