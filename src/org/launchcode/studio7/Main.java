package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object
        CD firstCD = new CD("Disc Data", "Oops!... I Did It Again", 500, "songs", "music", 1 );
        DVD firstDVD = new DVD("DVD Data", "Up", 1000, "movie", "stories", 10.0);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        firstCD.skipTrack();
        firstCD.skipTrack();


    }
}
