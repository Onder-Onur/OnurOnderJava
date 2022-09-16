package HomeworksAll;

public class Homework39Movie {
    //Write "Movie" Class Where it has following Attribute (Instance Variables)
    //1) String "Name"
    //2) String "Type"
    //3) double "Rating" (out of 10) ex: 8.7
    //4) String "Star" ex: Tom Hanks
    //Every time when you are creating an object from Movie Class, User should be prompt to Enter the attributes (hint Scanner)

    String Movie;
    String Type;
    double Rating;
    String Star;

    public Homework39Movie(String movie, String type, double rating, String star){
        this.Movie = movie;
        this.Type = type;
        this.Rating = rating;
        this.Star = star;
    }

    public Homework39Movie(){

    }


    public String toString(){
        String result = "Movie Name: "+ Movie +"\n Type: "+ Type + "\n Raiting: "+Rating+"\n Star: "+Star+"\n";
        return result;
    }

}
