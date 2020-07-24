package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc implements IOpticalDisc {
    private String rpm;
    private Double dataStorageCapacity;
    private Boolean dataPresent;
    //private Boolean readByLaser;
    private String name;
    private String contentType;


    public BaseDisc(String rpm, Double dataStorageCapacity, Boolean dataPresent, String name, String contentType){
        this.rpm = rpm;
        this.dataStorageCapacity = dataStorageCapacity;
        this.dataPresent = dataPresent;
        //this.readByLaser = readByLaser;
        this.name = name;
        this.contentType = contentType;
    }

    //Getter and Setters
    public String getRpm() {
        return rpm;
    }

    public Double getDataStorageCapacity() {
        return dataStorageCapacity;
    }

    public Boolean getDataPresent() {
        return dataPresent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }



    //Methods
    public void discSpins(){
        System.out.println("It's spinning! " + rpm + " rpms and counting!");
    }

    public void discReadout(){
        System.out.println("Name: " + name +
                "\nContent Type: " + contentType +
                "\nData Storage Capacity: " + dataStorageCapacity);
    }

}
