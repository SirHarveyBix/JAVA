package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        System.out.println("\n # # # # # \n");

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        System.out.println("\n # # # # # \n");

        Object theComedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) theComedy;
        comedyMovie.watchComedy();

        System.out.println("\n # # # # # \n");

        // Local Variable Type Inference
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        System.out.println("\n # # # # # \n");

        // Local Variable Type Inference
        var plane = new Comedy("Airplane");
        plane.watchComedy();

        System.out.println("\n # # # # # \n");

        /* #Runtime type */
        Object unknownObject = Movie.getMovie("S", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            /* var airplane = Movie.getMovie("C", "Airplane"); don't need to be cast, instead of the next line,
             * because the next line IS polymorphism */
            Comedy comedy = (Comedy) unknownObject;
            comedy.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            /* if JAVA identify the object matches the type,
             * it extracts data from the object without casting */
            syfy.watchScienceFiction();
        }
    }
}
