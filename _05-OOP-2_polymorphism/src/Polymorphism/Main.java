package Polymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();

        System.out.println("\n # # # # # \n");

        Movie anotherMovie = Movie.getMovie("SciFi", "Star Wars");
        anotherMovie.watchMovie();

        System.out.println("\n # # # # # \n");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter Type (A: Adventure, C: Comedy, S: Science Fiction, or Q to quit): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) break;

            System.out.println("Enter Movie Title: ");

            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);

            movie.watchMovie();
        } while (true);
    }
}
