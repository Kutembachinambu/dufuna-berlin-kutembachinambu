package com.dufuna.berlin.kutembachinambu.lekki.service;


import com.dufuna.berlin.kutembachinambu.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

public interface LekkiPropertyService {


          void saveProperty(Object LekkiProperty);


          Object getProperty(int propertyId);

          Object getProperties();
};
