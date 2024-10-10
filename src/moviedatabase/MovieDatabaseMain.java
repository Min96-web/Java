package moviedatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for a movie database as part of an assignment
 * in the course Introduction to Programming with Java.
 */
public class MovieDatabaseMain {
    /**
     * Program entry point. Starts the movie database UI.
     *
     * @param args not used
     */
    public static void main(String[] args) throws IOException {
        List<Movie> movies = new ArrayList<>();
        //Construct and start the UI
        new MovieDatabaseUI().startUI();
    }
}