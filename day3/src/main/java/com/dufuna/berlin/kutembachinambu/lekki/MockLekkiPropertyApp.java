package com.dufuna.berlin.kutembachinambu.lekki;

import com.dufuna.berlin.kutembachinambu.lekki.model.LekkiProperty;
import com.dufuna.berlin.kutembachinambu.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import com.dufuna.berlin.kutembachinambu.lekki.service.LekkiPropertyService;

public class MockLekkiPropertyApp implements LekkiPropertyService {
    SimpleLekkiPropertyRepositoryImpl repo = new SimpleLekkiPropertyRepositoryImpl();
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            LekkiProperty property = new LekkiProperty();

        }
    }

    @Override
    public void saveProperty(Object property) {

    }

    @Override
    public Object getProperty(int propertyId) {
        Object LekkiProp = repo.findById(1);
        return LekkiProp;
    }

    @Override
    public Object getProperties() {
        Object LekkiProp = repo.findAll();
        return LekkiProp;
    }
}
