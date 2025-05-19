import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieBrowser {

    public static void main(String[] args) {
        List<Movie> movies = getMovies();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a keyword to search for movies:");
        String keyword = scanner.nextLine().toLowerCase();

        List<Movie> results = searchMovies(movies, keyword);

        if (results.isEmpty()) {
            System.out.println("No movies found matching: " + keyword);
        } else {
            System.out.println("Search Results:");
            for (Movie movie : results) {
                System.out.println(movie.getTitle() + " (" + movie.getYear() + ")");
            }
        }

        scanner.close();
    }

    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Free Guy", "2021", "https://m.media-amazon.com/images/I/91dYe4m4XXL._AC_UF894,1000_QL80_.jpg"));
        movies.add(new Movie("Top Gun: Maverick", "2022", "https://m.media-amazon.com/images/I/71BokibfVUL.jpg"));
        movies.add(new Movie("Mission: Impossible – Dead Reckoning Part One", "2023", "https://m.media-amazon.com/images/I/91dYe4m4XXL._AC_UF894,1000_QL80_.jpg"));
        movies.add(new Movie("Detective Conan: The Million-Dollar Pentagram (名探偵コナン 100万ドルの五稜星)", "2024", "https://m.media-amazon.com/images/M/MV5BYjQ4OWRiOTEtMDhjYS00YWEyLWFlNDEtNWJlYmViZjBjNjhhXkEyXkFqcGc@._V1_.jpg"));
        movies.add(new Movie("A Minecraft Movie", "2025", "https://m.media-amazon.com/images/M/MV5BYzFjMzNjOTktNDBlNy00YWZhLWExYTctZDcxNDA4OWVhOTJjXkEyXkFqcGc@._V1_FMjpg_UX1000_.jpg"));
        return movies;
    }

    public static List<Movie> searchMovies(List<Movie> movies, String keyword) {
        List<Movie> filtered = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(keyword)) {
                filtered.add(movie);
            }
        }
        return filtered;
    }
}
