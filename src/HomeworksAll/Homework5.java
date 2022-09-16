package HomeworksAll;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //-Write a code where a teacher is entering student's first name, last name and the point they received from the exam.
        //- based on the point the code should automatically determine the grade of Student with the full name of the student
        //- This should be done for each student
        //- Assuming we do not know how many student are there but your code should still handle this situation
        //-  example input (first name = From the teacher, Last name=  from the teacher Point= from the teacher (90.5)
        //- When the point is between 90 to 100 the grade should be A
        //- When the point is between 80 to 90(excluded) the grade should be B
        //- When the point is between 70 to 80(excluded) the grade should be C
        //- When the point is between 60 to 70 (excluded) the grade should be D
        //- When the point is less than 60 the grade should be F
        //- Example output (First Name = Ziya Last Name = Yilmaz Grade: A )

        String name="";
        String lastName= "";
        int point = 0;
        String grade="";
        int ext;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Please enter student name: ");
            name=input.nextLine();
            System.out.println("Please enter student last name: ");
            lastName=input.nextLine();
            System.out.println("Please enter a point for this student: ");
            point=input.nextInt();

            if (point >=90 && point<=100){
                grade = "A";
            } else if (point >=80 && point<90) {
                grade="B";
            } else if (point >=70 && point<80) {
                grade="C";
            } else if (point >=60 && point<70) {
                grade="D";
            } else if (point >=0 && point<60) {
                grade="F";
            }
            System.out.println("First Name = "+ name +" Last Name = "+lastName+" Grade: "+ grade);

            System.out.println("Dou yo have any other student to grade? 1 for Yes 2 for No:");
            ext=input.nextInt();
            if(ext == 2){
                break;
            }
        }
    }
}
