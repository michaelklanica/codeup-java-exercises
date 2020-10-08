package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        do {
            Input input = new Input();

            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in animated category");
            System.out.println("3 - view movies in drama category");
            System.out.println("4 - view movies in horror category");
            System.out.println("5 - view movies in sci-fi category");
            System.out.println("6 - view movies in comedy category");
            System.out.println("7 - view movies in musical category\n");

            switch (input.getInt(0, 7)) {
                case 0:
                    System.out.println("exiting...");
                    return;
                case 1:
                    getMovies();
                    break;
                case 2:
                    getMovies("animated");
                    break;
                case 3:
                    getMovies("drama");
                    break;
                case 4:
                    getMovies("horror");
                    break;
                case 5:
                    getMovies("scifi");
                    break;
                case 6:
                    getMovies("comedy");
                    break;
                case 7:
                    getMovies("musical");
                    break;
                default:
                    break;
            }

        } while (true);
    }

    public static void getMovies() {
        System.out.println("getting all movies...");
        for (Movie movie : MoviesArray.findAll()) {
            System.out.println(movie.getName());
        }
    }

    public static void getMovies(String category) {
        System.out.println("getting " + category + " movies...");
        for (Movie movie : MoviesArray.findAll()) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName());
            }
        }
    }
}
