package com.twuc;

public class NewReleaseMovie extends Movie {
    NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2: 1;
    }
}
