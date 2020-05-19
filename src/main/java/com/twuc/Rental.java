package com.twuc;

class Rental {
    private Movie movie;
    private int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getCharge() {
        return movie.getCharge(daysRented);
    }

    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }

    Movie getMovie() {
        return movie;
    }
}
