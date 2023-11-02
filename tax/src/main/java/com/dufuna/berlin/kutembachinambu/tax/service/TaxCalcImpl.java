package com.dufuna.berlin.kutembachinambu.tax.service;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import com.dufuna.berlin.kutembachinambu.tax.repository.TaxBracketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class TaxCalcImpl implements TaxCalcuation {

    @Autowired
    private TaxBracketRepository taxBracketRepository;

    @Override
    public Float calculateTax(Float Amount) {
        List<TaxBracket>
        return null;
    }
}
