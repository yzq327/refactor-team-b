package com.twuc;

public class RegularMovie extends Movie {
    RegularMovie(String title) {
        super(title);
    }

    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }

    @Override
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
