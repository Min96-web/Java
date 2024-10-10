package moviedatabase;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * A command line user interface for a movie database.
 */
public class MovieDatabaseUI {
    private Scanner _scanner;
    private MovieFileHandler movieFileHandler;
    List<Movie> movies = new ArrayList<Movie>();
    /**
     * Construct a MovieDatabaseUI.
     */
    public MovieDatabaseUI() throws IOException {
        movieFileHandler = new MovieFileHandler(Paths.get("movies.txt"));
        movies = movieFileHandler.loadMovies();
        //for(Movie m : movies){
       // }
        movieFileHandler.saveMovies(movies);
    }
    /**
     * Start the movie database UI.
     */
    public void startUI() throws IOException {
        _scanner = new Scanner(System.in);
        int input;
        boolean quit = false;

        System.out.println("** FILMDATABAS **");

        while(!quit) {
            input = getNumberInput(_scanner, 1, 4, getMainMenu());

            switch(input) {
                case 1: searchTitel(); break;
                case 2: searchReviewScore(); break;
                case 3: addMovie(); break;
                case 4: quit = true;
            }
        }
        //Close scanner to free resources
        _scanner.close();
    }
    /**
     * Get input and translate it to a valid number.
     *
     * @param scanner the Scanner we use to get input
     * @param min the lowest correct number
     * @param max the highest correct number
     * @param message message to user
     * @return the chosen menu number
     */
    private int getNumberInput(Scanner scanner, int min, int max, String message) {
        int input = -1;
        while(input < 0) {
            System.out.println(message);
            try {
                input = Integer.parseInt(scanner.nextLine().trim());
            }
            catch(NumberFormatException nfe) {
                input = -1;
            }
            if(input < min || input > max) {
                System.out.println("Ogiltigt värde.");
            }
        }
        return input;
    }
    /**
     * Get search string from user, search title in the movie
     * database and present the search result.
     */
    private void searchTitel() {
        System.out.print("Ange sökord: ");
        String title = _scanner.nextLine().trim();
        for(int i = 0; i < movies.size(); i++){
                if(movies.get(i).name().toLowerCase().contains(title.toLowerCase())){
                    System.out.println(movies.get(i).toString());
                }
            }
        }
    /**
     * Get search string from user, search review score in the movie
     * database and present the search result.
     */
    private void searchReviewScore() {
        int review = getNumberInput(_scanner, 1, 5, "Ange minimibetyg (1 - 5): ");
        boolean play = true;
        //List<Movie> movies = new ArrayList<Movie>();
        //for(Movie m : movies){
            for (int i = 0; i < movies.size();i++) {
                if (movies.get(i).rating() == review) {
                    System.out.println(movies.get(i).toString());
                    play = false;
                }
            }
                if (play) {
                    System.out.println("Tyvärr! Inga filmer är med detta betyg.");

                }
            }
    /**
     * Get information from user on the new movie and add
     * it to the database.
     */
    private void addMovie() throws IOException {
        System.out.print("Titel: ");
        String title = _scanner.nextLine().trim();
        int reviewScore = getNumberInput(_scanner, 1, 5, "Betyg (1 - 5): ");
        movies.add(new Movie(title,reviewScore));
        movieFileHandler.saveMovies(movies);
        System.out.println("Du har lagt till en film!");

    }
    /**
     * Return the main menu text.
     *
     * @return the main menu text
     */
    private String getMainMenu() {
        return  "-------------------\n" +
                "1. Sök på titel\n" +
                "2. Sök på betyg\n" +
                "3. Lägg till film\n" +
                "-------------------\n" +
                "4. Avsluta";
    }
}