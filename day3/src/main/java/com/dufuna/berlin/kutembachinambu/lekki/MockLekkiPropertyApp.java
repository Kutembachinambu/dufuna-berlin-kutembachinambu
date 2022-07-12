package com.dufuna.berlin.kutembachinambu.lekki;

import com.dufuna.berlin.kutembachinambu.lekki.model.LekkiProperty;
import com.dufuna.berlin.kutembachinambu.lekki.service.LekkiPropertyService;

public class MockLekkiPropertyApp implements LekkiPropertyService {
    public static void main(String[] args) {
        LekkiProperty property = new LekkiProperty();
        
    }

    @Override
    public void saveProperty(String LekkiProperty) {
        System.out.println("Property Saved");

    }

    @Override
    public String getProperty() {
        System.out.println("Property gotten");
        return null;
    }
}
