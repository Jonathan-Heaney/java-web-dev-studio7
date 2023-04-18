package org.launchcode.studio7;

public abstract class BaseDisc {
    private String discData;
    private String name;
    private Integer capacity;
    private String contents;
    private String type;

    public BaseDisc(String discData, String name, Integer capacity, String contents, String type) {
        this.discData = discData;
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.type = type;
    }

    public void writeData(String discData) {
        this.discData = discData;
    }

    public String readData() {
        return this.discData;
    }

    public String reportName() {
        return this.name;
    }

    public Integer reportCapacity() {
        return this.capacity;
    }

    public String reportContents() {
        return this.contents;
    }

    public String reportType() {
        return this.type;
    }


}
