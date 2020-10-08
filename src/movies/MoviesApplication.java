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


            int response = input.getInt(0, 7);

            switch (response) {
                case 0:
                    System.out.println("exiting...");
                    return;
                case 1:
                    System.out.println("getting all movies...");
                    Movie[] allMovies = MoviesArray.findAll();
                    for (Movie movie : allMovies) {
                        System.out.println(movie.getMovieName());
                    }
                    break;
                case 2:
                    System.out.println("getting animated movies...");
                    Movie[] animatedMovies = MoviesArray.findAll();
                    for (Movie movie : animatedMovies) {
                        if (movie.getMovieCategory() == "animated") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    break;
                case 3:
                    System.out.println("getting dramas...");
                    Movie[] dramaMovies = MoviesArray.findAll();
                    for (Movie movie : dramaMovies) {
                        if (movie.getMovieCategory() == "drama") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    break;
                case 4:
                    System.out.println("getting horror movies...");
                    Movie[] horrorMovies = MoviesArray.findAll();
                    for (Movie movie : horrorMovies) {
                        if (movie.getMovieCategory() == "horror") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    break;
                case 5:
                    System.out.println("getting sci-fi movies...");
                    Movie[] scifiMovies = MoviesArray.findAll();
                    for (Movie movie : scifiMovies) {
                        if (movie.getMovieCategory() == "scifi") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    break;
                case 6:
                    System.out.println("getting comedies...");
                    Movie[] comedyMovies = MoviesArray.findAll();
                    for (Movie movie : comedyMovies) {
                        if (movie.getMovieCategory() == "comedy") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    break;
                case 7:
                    System.out.println("getting musical movies...");
                    Movie[] musicalMovies = MoviesArray.findAll();
                    for (Movie movie : musicalMovies) {
                        if (movie.getMovieCategory() == "musical") {
                            System.out.println(movie.getMovieName());
                        }
                    }
                    break;
                default:
                    break;
            }


        } while (true);
    }
}
