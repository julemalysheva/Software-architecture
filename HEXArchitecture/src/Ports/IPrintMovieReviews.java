package Ports;


import java.util.List;

import Domain.MovieReview;

public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
