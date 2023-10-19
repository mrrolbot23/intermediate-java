package PolymorphismUdemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movie theMovie = new Movie("Star Wars");

        theMovie.watchMovie();

        Movie adventureMovie = new Adventure("Iron Man");

//        This method is creating a new movie using the getMovie and
//        assigning the type based on the first letter of the type ("Comedy") passed
//        Is using the switch statement that is part of the getMovie method inside the Movie class
        Movie newMovie = Movie.getMovie("Comedy", "Hot Shot");

        newMovie.watchMovie();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter type (A for Adventure, C for Comedy, S for SciFi, or Q for Quit: ");
            String type = scanner.nextLine();

            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter movie title");
            String movieTitle = scanner.nextLine();

            Movie movie = Movie.getMovie(type, movieTitle);
            movie.watchMovie();
        }
    }

}
