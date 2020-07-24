package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("500-100", 32.0, true, "Are Fish Friends?", "music", "Under the Sea", "Fishin Bob", 90.10, 2020);

        DVD dvd = new DVD("700-1300", 42.1, true, "tobedecided...", "TBD", "neither!", 2021, 199.99);

        cd.spinDisc();
        cd.discSpins();
        cd.discReadout();

        dvd.spinDisc();
        dvd.discSpins();
        dvd.discReadout();





        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
