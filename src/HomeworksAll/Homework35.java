package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework35 {
    //Write a Car Class where it has following attributes:
    //1) Model
    //2) Year
    //3) Speed
    //and following method:
    //1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
    //2) PrintCar() - Where it prints each objects attributes
    //3) IncreaseSpeed() - Where it takes double values and it increase the Speed attribute by input amount
    //4) DecreaseSpeed() - Where it takes double values and it decrease the Speed attribute by input amount
    //
    //Create 4 instance of Car Class, after Setting the Attribute values,
    // Apply increaseSpeed and DecreaseSpeed Multiple times for different values.
    // For those which has speed of 80 or more, Print warning such as "Car "Model" and"Speed" is danger of getting ticket"


    public static void main(String[] args) {
        Car car1 = new Car();
        car1.SetAttributes("Toyota",2019,45);
        Car car2 = new Car();
        car2.SetAttributes("Mercedes",2020,50);
        Car car3 = new Car();
        car3.SetAttributes("Volvo",2021,60);
        Car car4 = new Car();
        car4.SetAttributes("Dodge",2022,65);

        ArrayList<Car> Cars = new ArrayList<>();
        Cars.addAll(Arrays.asList(car1,car2,car3,car4));

        for (Car car:Cars) {
            car.IncreaseSpeed(10);
            if (car.Speed>=80){
                car.Print();
                System.out.print("Is danger of getting ticket");
                System.out.println("************************************");
            }
        }

        for (Car car:Cars) {
            car.DeccreaseSpeed(5);
            if (car.Speed>=80){
                car.Print();
                System.out.print("Is danger of getting ticket");
                System.out.println("************************************");
            }
        }
        for (Car car:Cars) {
            car.IncreaseSpeed(20);
            if (car.Speed>=80){
                car.Print();
                System.out.println("Is danger of getting ticket");
                System.out.println("************************************");
            }
        }



    }

}
