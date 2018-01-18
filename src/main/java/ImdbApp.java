import entity.Movie;
import repository.ImdbRepository;


public class ImdbApp {

	public static void main(String[] args) {
		ImdbRepository repository = new ImdbRepository();
		Movie movie = new Movie("Dil Chaha ta hai");
		repository.createMovie(movie);
		repository.getAllMovies();
	}
}
