package com.twuc;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

class Customer {
    private static final String HEADER_LINE = "Rental Record for %s\n";
    private static final String TOTAL_CHARGE_LINE = "Amount owed is %s\n";
    private static final String TOTAL_POINTS_LINE = "You earned %s frequent renter points";
    private static final String EACH_RENTAL_RECORD_LINE = "\t%s\t%s\n";

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    String statement() {
        StringBuilder result = new StringBuilder(format(HEADER_LINE, name));
        for (Rental rental : rentals) {
            result.append(format(EACH_RENTAL_RECORD_LINE, rental.getMovie().getTitle(), rental.getCharge()));
        }
        result.append(format(TOTAL_CHARGE_LINE, getTotalCharge()));
        result.append(format(TOTAL_POINTS_LINE, getTotalFrequentRenterPoints()));
        return result.toString();
    }

    void addRental(Rental arg) {
        rentals.add(arg);
    }

    String htmlStatement() {
        //todo
        return null;
    }

    private double getTotalCharge() {
        return rentals.stream().mapToDouble(Rental::getCharge).sum();
    }

    private int getTotalFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }
}
