package com.dufuna.berlin.kutembachinambu.lekki.model;

public class LekkiProperty {
    private int propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private String validFrom;
    private String validTo;

    public LekkiProperty () {
        propertyId = 1;
        propertyAddress = "24 Kasangula Road, Roma";
        propertyType = "Flat";
        numberOfBedrooms = 5;
        numberOfSittingRooms = 2;
        numberOfKitchens = 1;
        numberOfBathrooms = 4;
        numberOfToilets = 6;
        propertyOwner = "Goerge Gondwe";
        description = "Beautiful property with modern fittings in the heart of Lusaka";
        validFrom = "01/07/2020";
        validTo = "15/07/2023";
    }

    public int getPropertyId() {

        return propertyId;
    }

    public void setPropertyId(int newValue) {

        propertyId = newValue;
    }

    public String getPropertyAddress () {
        return propertyAddress;
    }

    public void setPropertyAddress(String newValue) {

        propertyAddress = newValue;
    }

    public String getPropertyType () {
        return propertyType;
    }

    public void setPropertyType(String newValue) {
        propertyType = newValue;
    }
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int newValue) {
        numberOfBedrooms = newValue;
    }
    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int newValue) {
        numberOfSittingRooms = newValue;
    }
    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int newValue) {
        numberOfKitchens = newValue;
    }
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int newValue) {
        numberOfBathrooms = newValue;
    }
    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int newValue) {
        numberOfToilets = newValue;
    }
    public String getPropertyOwner () {
        return propertyOwner;
    }

    public void setPropertyOwner(String newValue) {
        propertyOwner = newValue;
    }
    public String getDescription () {
        return description;
    }

    public void setDescription(String newValue) {
        description = newValue;
    }
    public String getValidFrom () {
        return validFrom;
    }

    public void setValidFrom(String newValue) {
        validFrom = newValue;
    }
    public String getValidTo () {
        return validTo;
    }

    public void setValidTo(String newValue) {
        validTo = newValue;
    }
    public String toString(){
        return (propertyId +"," + propertyAddress +","+ propertyType);
    }
    public int hashCode() {
        return propertyId;
    }
    public boolean equals(Object obj){
        if (obj.equals(propertyId)) {
            return true;
        } else {
            return false;
        }
    }


}
