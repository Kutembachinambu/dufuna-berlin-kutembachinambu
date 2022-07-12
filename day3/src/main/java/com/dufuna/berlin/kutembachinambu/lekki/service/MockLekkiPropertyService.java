package com.dufuna.berlin.kutembachinambu.lekki.service;

public class MockLekkiPropertyService implements LekkiPropertyService{
    @Override
    public void saveProperty(String LekkiProperty) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public String getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
