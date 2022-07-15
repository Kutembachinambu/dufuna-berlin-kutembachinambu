package com.dufuna.berlin.kutembachinambu.lekki.repository;

import java.util.HashMap;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {
    static HashMap<Integer, String> Lekki = new HashMap<>();



    public Object save(int key, String LekkiProperty) {
        Lekki.put(key, LekkiProperty);
        return LekkiProperty;
    }


    public Object findById(int propertyId) {
        if (Lekki.containsKey(propertyId)) {
            Object props =Lekki.get(propertyId);
            return props;
        }
        return null;
    }


    public Object findAll() {
        return Lekki;
    }

    @Override
    public void update(int propertyId, String LekkiProperty) {
        Lekki.replace(propertyId, LekkiProperty);

    }
}