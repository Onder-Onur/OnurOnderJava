package HomeworksAll;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework40{
    //Use "Movie" Class to create objects.
    //Create 5 Movie instances (Objects)
    //Write a Method where it takes List of all the movies and returns to List of Movies those are "Action" types

    public static void main(String[] args) {
        ArrayList<Homework39Movie> movies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int counter =0;
        loop1:
        while (true){
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
            movies.add(newMovie);

            counter += 1;
            if (counter==5){
                break loop1;
            }
            else {
                continue;
            }

        }
        System.out.println(Action(movies));
    }
    public static ArrayList<Homework39Movie> Action(ArrayList<Homework39Movie> listMovies){
        System.out.println("The List of Action Movies: ");
        ArrayList<Homework39Movie> checkList = new ArrayList<>();
        for (Homework39Movie movie : listMovies) {
            if(movie.Type.equalsIgnoreCase("action")){
                checkList.add(movie);
            }else {
                continue;
            }
        }
        return checkList;
    }
}
