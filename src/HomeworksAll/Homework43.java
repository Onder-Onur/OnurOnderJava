package HomeworksAll;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework43 {
    //Use previously created 5 Movie objects for task below:
    //Write a Method Where it takes List of Movies and The Type and Prints a name of the Movie as a suggestion to User based on the Rating
    //ex. Movie 1: Name: "Top Gun", Type = "Action",  Rating = 8.9, Star = "Tom Cruise"
    //    Movies 2) Name: "Bullet Train", Type = "Action" Rating = 7.5, Star = "Brad Pitt"
    //
    //Mthod(Arraylist Movie, String Type)
    //print: We recommend this movie based on your choice :  Name: "Top Gun", Type = "Action",  Rating = 8.9, Star = "Tom Cruise"

    public static void main(String[] args) {
        ArrayList<Homework39Movie> movies = new ArrayList<>();

        Homework39Movie movie1 = new Homework39Movie();
        movie1.Movie = "The Shawshank Redemption";
        movie1.Type = "Drama";
        movie1.Rating = 8;
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

        System.out.println(MovieSuggestions(movies,"Drama"));

    }

    public static ArrayList<Homework39Movie> MovieSuggestions(ArrayList<Homework39Movie> arrayList,String type){
        System.out.println("We recommend this movie based on your choice : (The list is sorted by raitings.)");
        ArrayList<Homework39Movie> movieList = new ArrayList<>();
        for (Homework39Movie movie:arrayList) {
            if(movie.Type.equalsIgnoreCase(type)){
                movieList.add(movie);
            }
            movieList=SortMovies(movieList);
        }
        return movieList;
    }
    public static ArrayList<Homework39Movie> SortMovies(ArrayList<Homework39Movie> movies){
        ArrayList <Homework39Movie> sortedMovies = movies;
        Homework39Movie tmp;
        for (int i = 0; i < sortedMovies.size(); i++) {
            for (int j = sortedMovies.size() - 1; j > i; j--) {
                if (sortedMovies.get(i).Rating < sortedMovies.get(j).Rating) {
                    tmp = sortedMovies.get(i);
                    sortedMovies.set(i,sortedMovies.get(j));
                    sortedMovies.set(j,tmp);
                }
            }
        }
        return sortedMovies;
    }
}
