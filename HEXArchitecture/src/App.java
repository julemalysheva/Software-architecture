import Adapters.ConsolePrinter;
import Adapters.MovieReviewsRepo;
import Adapters.UserCommand;
import Application.MovieUser;
import Domain.MovieSearchRequest;
import Ports.IFetchMovieReviews;
import Ports.IPrintMovieReviews;
import Ports.IUserInput;

public class App {
    public static void main(String[] args) throws Exception {

        IFetchMovieReviews fetchMovieReviews = new MovieReviewsRepo();
        IPrintMovieReviews printMovieReviews = new ConsolePrinter();

        IUserInput userCommand = new UserCommand(fetchMovieReviews, printMovieReviews);

        MovieUser movieUser = new MovieUser(userCommand);
        
        MovieSearchRequest starWarsRequest = new MovieSearchRequest("StarWars");
        MovieSearchRequest starTreckRequest = new MovieSearchRequest("StarTreck");

        System.out.println("Displaying reviews for movie " + starTreckRequest.getMovieName());
        movieUser.processInput(starTreckRequest);

        System.out.println("Displaying reviews for movie " + starWarsRequest.getMovieName());
        movieUser.processInput(starWarsRequest);

    }
}