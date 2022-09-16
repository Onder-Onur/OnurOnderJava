package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework34a {
    public static void main(String[] args) {
        Shoes shoe1= new Shoes();
        shoe1.SetInfo("Adidas",7.5, "Running", 69.99);
        Shoes shoe2= new Shoes();
        shoe2.SetInfo("Nike",11, "Tracking", 78.99);
        Shoes shoe3= new Shoes();
        shoe3.SetInfo("Puma",1, "Indoor", 9.99);
        Shoes shoe4= new Shoes();
        shoe4.SetInfo("Skechers",1, "Indoor", 39.99);

        ArrayList<Shoes> Objects =new ArrayList<>();
        Objects.addAll(Arrays.asList(shoe1,shoe2,shoe3,shoe4));

        System.out.println("The shoues which have prices over 10");
        for (Shoes shoe :Objects) {
            if(shoe.Price>10){
                shoe.Print();
                System.out.println("********************************");
            }
            else {
                continue;
            }
        }
        System.out.println("**************************************************");
        for (Shoes shoe :Objects) {
            if(shoe.Price>50){
                shoe.Price = shoe.Price * 0.85;
            }
            else {
                continue;
            }
        }
        System.out.println("All shoes After applying %15 discout that have price higher than 50");
        for (Shoes shoe :Objects) {
                shoe.Print();
            }

    }

}
