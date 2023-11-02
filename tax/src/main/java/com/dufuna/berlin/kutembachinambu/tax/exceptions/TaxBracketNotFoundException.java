package com.dufuna.berlin.kutembachinambu.tax.exceptions;

public class TaxBracketNotFoundException extends RuntimeException{
    public TaxBracketNotFoundException(Integer id) {
        super("Could not find employee " + id);
    }
}
