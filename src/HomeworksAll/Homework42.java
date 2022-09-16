package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework42{
    //Use previously created 5 Movie objects for task below:
    //Write a Method Where It takes List of Movies and returns to the List of All the Actors/ Actress (Star)
    public static void main(String[] args) {
        ArrayList<Homework39Movie> movies = new ArrayList<>();

        Homework39Movie movie1 = new Homework39Movie();
        movie1.Movie = "The Shawshank Redemption";
        movie1.Type = "Drama";
        movie1.Rating = 9.3;
        movie1.Star = "Tim Robinson";

        Homework39Movie movie2 = new Homework39Movie();
        movie2.Movie = "The Godfather";
        movie2.Type = "Drama";
        movie2.Rating = 9.2;
        movie2.Star = "Marlon Brando";

        Homework39Movie movie3 = new Homework39Movie();
        movie3.Movie = "The Dark Knight";
        movie3.Type = "Action";
        movie3.Rating = 9.9;
        movie3.Star = "Christian Bale";

        Homework39Movie movie4 = new Homework39Movie();
        movie4.Movie = "The Lord of the Rings: The Return of the King";
        movie4.Type = "Action";
        movie4.Rating = 9;
        movie4.Star = "Elijah Wood";

        Homework39Movie movie5 = new Homework39Movie();
        movie5.Movie = "Schindler's List";
        movie5.Type = "Drama";
        movie5.Rating = 9;
        movie5.Star = "Liam Neeson";

        movies.addAll(Arrays.asList(movie1,movie2,movie3,movie4,movie5));

        System.out.println(NameList(movies));
    }
    public static ArrayList<String> NameList(ArrayList<Homework39Movie> arrayList){
        System.out.println("Names of the Actors/ Actress");
        ArrayList<String> movieList = new ArrayList<>();
        for (Homework39Movie movie:arrayList) {
                movieList.add(movie.Star);
        }
        return movieList;
    }
}
