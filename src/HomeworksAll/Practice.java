package HomeworksAll;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public String Name;
    public String LastName;
    private int SIN;
    private double Salary;
    public int Experience;

    public Practice(){

    }
    public Practice(String name,String lastname){

    }
    public Practice(String name,String lastname,int sin,double salary,int experience){
        this.Name = name;
        this.LastName = lastname;
        this.SIN = sin;
        this.Salary = salary;
        this.Experience = experience;

    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void addSalary(double incSalary){
        this.Salary+=incSalary;
    }
    public void Print(){
        System.out.println("Name : "+Name+"\tLast Name :"+LastName+"\tSin Number: "+SIN+"\tSalary: "+Salary+"\tExperience "+Experience);
    }
    public void SetPractice(String name, String lastName, int sin, double salary, int experience ){
        Name = name;
        LastName = lastName;
        SIN = sin;
        Salary = salary;
        Experience = experience;

    }
}


