package moviedatabase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles saving and loading of movies
 */
public class MovieFileHandler {
    private Path _path;
    /**
     * Create a movie that reads and writes to the provided path
     * @param path the path we want to read and write to
     */
    public MovieFileHandler(Path path) {
        _path = path;
    }

    /**
     * Load movies from file
     * @return movies loaded from file
     * @throws IOException if there is a problem while loading from file
     */
    public List<Movie> loadMovies() throws IOException {
       if(!Files.exists(_path)) {
           Files.createFile(_path);
       }
       List<String> sMovies = Files.readAllLines(_path);
       List<Movie> movies = new ArrayList<>();
       for(String s : sMovies) {
           String[] line = s.split(",");
           movies.add(new Movie(line[0], + Integer.parseInt(line[1])));
       }
       return movies;
    }

    /**
     * Save movies to the file
     * @param movies movies we want to save
     * @throws IOException if there is a problem while saving to file
     */
    public void saveMovies(List<Movie>movies) throws IOException {
        List<String> sMovies = new ArrayList<>();
        for(Movie m : movies) {
            sMovies.add(m.name()+ "," + m.rating());
        }
        Files.write(_path,sMovies);
    }
}
