package com.dufuna.berlin.kutembachinambu.tax.service;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import com.dufuna.berlin.kutembachinambu.tax.repository.TaxBracketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class TaxCalcImpl implements TaxCalcuation {
    private final TaxBracketRepository taxBracketRepository;

    @Autowired
    public TaxCalcImpl(TaxBracketRepository taxBracketRepository) {
        this.taxBracketRepository = taxBracketRepository;
    }

    @Override
    public Float calculateTax(Float amount) {
        List<TaxBracket> taxBrackets = taxBracketRepository.findAll();
        Float tax = 0.0f;

        for(TaxBracket bracket: taxBrackets){
            if(amount>=bracket.getBracketStart() && amount<=bracket.getBracketEnd()){
                tax= bracket.getDueTax() + (amount-bracket.getBracketStart())* bracket.getRate();
                System.out.println("The tax Due is" +tax);
                break;
            }
        }

        return tax;
    }
}
