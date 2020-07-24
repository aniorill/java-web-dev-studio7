package org.launchcode.studio7;

public class DVD extends BaseDisc {
    private String movieGenre;
    private int movieYear;
    private Double lengthOfMovie;

    public DVD(String rpm, Double dataStorageCapacity, Boolean dataPresent, String name, String contentType, String movieGenre, int movieYear, Double lengthOfMovie){

        super(rpm, dataStorageCapacity, dataPresent, name, contentType);
        this.movieGenre = movieGenre;
        this.movieYear = movieYear;
        this.lengthOfMovie= lengthOfMovie;
    }

    //Getters and Setters


    public String getMovieGenre() {
        return movieGenre;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public Double getLengthOfMovie() {
        return lengthOfMovie;
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + this.getRpm() + " rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
