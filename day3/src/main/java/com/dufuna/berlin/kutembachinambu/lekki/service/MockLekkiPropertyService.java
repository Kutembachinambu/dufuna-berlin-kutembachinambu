package com.dufuna.berlin.kutembachinambu.lekki.service;

public class MockLekkiPropertyService implements LekkiPropertyService{

    @Override
    public void saveProperty(Object LekkiProperty) {
        System.out.println("MockLekkiPropertyService.saveProperty called");

    }

    @Override
    public Object getProperty(int propertyId) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }

    @Override
    public Object getProperties() {
        return null;
    }
}
