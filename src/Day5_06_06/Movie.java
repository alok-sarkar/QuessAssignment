package Day5_06_06;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating="PG";
    }
    Movie[] getPg(Movie[] movies){
        ArrayList<Movie> pgMovies= new ArrayList<>();

        for (Movie movie : movies) {
            if(movie.rating.compareTo("PG")==0)
                pgMovies.add(movie);
        }
        Movie[] result= new Movie[pgMovies.size()];
        int i=0;
        for (Movie movie : pgMovies) {
            result[i]=movie;
            i++;
        }
        return result;
    }
}

