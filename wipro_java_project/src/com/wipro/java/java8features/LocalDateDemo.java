/**
 * 
 */
package com.wipro.java.java8features;

/**
 * In LocalDateDemo we demonstrating the java8 feature LocalDate and it's behaviors
 */

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class LocalDateDemo {

    // Method to demonstrate TemporalAdjusters with 'date.with()' and no parameters
    public static void demonstrateLocalDate() {
        // Get today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // First day of the current month
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First Day of Current Month: " + firstDayOfMonth);

        // Last day of the current month
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last Day of Current Month: " + lastDayOfMonth);

        // First day of the next month
        LocalDate firstDayOfNextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First Day of Next Month: " + firstDayOfNextMonth);

        // Next Monday
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next Monday: " + nextMonday);

        // Previous Friday
        LocalDate previousFriday = today.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println("Previous Friday: " + previousFriday);

        // First Monday of the month
        LocalDate firstMondayOfMonth = today.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY));
        System.out.println("First Monday of the Month: " + firstMondayOfMonth);
    }

    public static void main(String[] args) {
        // Call the method to demonstrateLocalDate with 'date.with()'
    	demonstrateLocalDate();
    }
}
