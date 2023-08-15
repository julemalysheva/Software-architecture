package Ports;

import java.util.List;

import Domain.MovieReview;
import Domain.MovieSearchRequest;

public interface IFetchMovieReviews {
    public List<MovieReview> fetchMovieReviews(MovieSearchRequest movieSearchRequest);
}
