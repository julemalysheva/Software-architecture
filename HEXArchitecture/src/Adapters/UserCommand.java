package Adapters;

import Application.MovieApp;
import Domain.Model;
import Domain.MovieSearchRequest;
import Ports.IFetchMovieReviews;
import Ports.IPrintMovieReviews;
import Ports.IUserInput;

public class UserCommand implements IUserInput {
    private Model model;

    public UserCommand(IFetchMovieReviews fetchMovieReviews, IPrintMovieReviews printMovieReviews) {
        MovieApp movieApp = new MovieApp(fetchMovieReviews, printMovieReviews);
        this.model = new Model(movieApp);
    }

    public void handleUserInput(Object userCommand) {
        model.Run((MovieSearchRequest)userCommand);
    }
}
