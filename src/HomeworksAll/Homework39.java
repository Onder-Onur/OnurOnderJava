package HomeworksAll;

import java.util.Scanner;

public class Homework39{
    //Write "Movie" Class Where it has following Attribute (Instance Variables)
    //1) String "Name"
    //2) String "Type"
    //3) double "Rating" (out of 10) ex: 8.7
    //4) String "Star" ex: Tom Hanks
    //Every time when you are creating an object from Movie Class, User should be prompt to Enter the attributes (hint Scanner)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the name of the Movie: ");
        String movieName = sc.nextLine();
        System.out.println("Please enter the type of the Movie: ");
        String movieType = sc.nextLine();
        System.out.println("Please enter the rating of the Movie (out of 10): ");
        double movieRating = sc.nextDouble();
        sc.nextLine();
        System.out.println("Please enter the name of the Star of the Movie: ");
        String movieStar = sc.nextLine();

        Homework39Movie newMovie = new Homework39Movie(movieName, movieType, movieRating, movieStar);

        System.out.println(newMovie.toString());

    }
}
