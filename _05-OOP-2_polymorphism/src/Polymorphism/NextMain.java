package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        System.out.println("\n # # # # # \n");

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        System.out.println("\n # # # # # \n");

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        System.out.println("\n # # # # # \n");

        // Local Variable Type Inference
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        System.out.println("\n # # # # # \n");

        // Local Variable Type Inference
        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
