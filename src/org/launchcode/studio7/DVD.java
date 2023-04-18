package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    private Double runTime = 10.0;

    public DVD(String discData, String name, Integer capacity, String contents, String type, Double runTime) {
        super(discData, name, capacity, contents, type);
        this.runTime = runTime;
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(String data) {

    }

    public void fastForward() {
        this.runTime++;
        System.out.println("You are now at minute " + runTime);
    }

    public void rewind() {
        this.runTime--;
        System.out.println("You are now at minute " + runTime);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
