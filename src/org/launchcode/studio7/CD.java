package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    private Integer currentTrack = 1;
    public CD(String discData, String name, Integer capacity, String contents, String type, Integer currentTrack) {
        super(discData, name, capacity, contents, type);
        this.currentTrack = currentTrack;

    }
    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(String data) {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public void skipTrack() {
        this.currentTrack++;
        System.out.println("Current track is " + this.currentTrack);
    }

    public void backTrack() {
        this.currentTrack--;
        System.out.println("Current track is " + this.currentTrack);
    }

    public Integer getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(Integer currentTrack) {
        this.currentTrack = currentTrack;
    }
}
