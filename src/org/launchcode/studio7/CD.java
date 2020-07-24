package org.launchcode.studio7;

public class CD extends BaseDisc{
    private String albumTitle;
    private String artistName;
    private Double albumLength;
    private int publicationYear;

    public CD(String rpm, Double dataStorageCapacity, Boolean dataPresent, String name, String contentType, String albumTitle, String artistName, Double albumLength, int publicationYear){

        super(rpm, dataStorageCapacity, dataPresent, name, contentType);
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.albumLength = albumLength;
        this.publicationYear = publicationYear;
    }

    //Getters and Setters


    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public Double getAlbumLength() {
        return albumLength;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    //Methods
    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + this.getRpm() + " rpm.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
