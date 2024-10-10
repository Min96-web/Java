package moviedatabase;
/**
 * A movie
 */
public class Movie {
    public static String[] NAMES = {"Terminator 2 - Domedagen ", "Nyckeln till frihet ",
            "Pulp fiction ", "Fight club ", "Matrix ", "När lammen tystnar ",
            "De misstänkta ", "American History X ", "Gladiator "};
    public static int[] RATINGS = {4, 5, 4, 4, 5, 4, 5, 4, 4};
    private String _name;
    private int _rating;

    /**
     * Construct a movie
     * @param name name of the movie
     * @param rating rating of the movie
     */
    public Movie(String name, int rating) {
        _name = name;
        _rating = rating;
    }

    /**
     * Method to get the name of movie
     * @return name
     */
    public String name() {
        return _name;
    }

    /**
     * Method to get the rating of the movie
     * @return rating
     */
    public int rating() {

        return _rating;
    }
    @Override
    public String toString(){
        String result = "Titel: " + name() + " Betyg: " + rating() + "/5";
        return result;
    }

}

