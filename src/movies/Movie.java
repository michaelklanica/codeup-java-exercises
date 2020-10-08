package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {
        return this.name;
    }

    public String getMovieCategory() {
        return this.category;
    }

    public void setMovieName(String name) {
        this.name = name;
    }

    public void setMovieCategory(String category) {
        this.category = name;
    }

    public static void getMovies() {
        System.out.println("getting all movies...");
        for (Movie movie : MoviesArray.findAll()) {
            System.out.println(movie.getMovieName());
        }
    }

    public static void getMovies(String category) {
        System.out.println("getting " + category + " movies...");
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getMovieCategory() == category) {
                System.out.println(movie.getMovieName());
            }
        }
    }
}
