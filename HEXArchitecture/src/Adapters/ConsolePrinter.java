package Adapters;


import java.util.List;

import Domain.MovieReview;
import Ports.IPrintMovieReviews;

public class ConsolePrinter implements IPrintMovieReviews {
    @Override
    public void writeMovieReviews(List<MovieReview> movieReviewList) {
        movieReviewList.forEach(movieReview -> {
            System.out.println(movieReview.toString());
        });
    }
}
