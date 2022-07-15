package com.dufuna.berlin.kutembachinambu.lekki.repository;

import com.dufuna.berlin.kutembachinambu.lekki.model.LekkiProperty;

public interface SimpleLekkiPropertyRepository {
     Object save(int key, String LekkiProperty);

     Object findById(int propertyId);

    Object findAll();
    void update(int propertyId, String LekkiProperty);

     

}
