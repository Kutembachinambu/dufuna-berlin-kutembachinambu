package com.dufuna.berlin.kutembachinambu.tax.exceptions;

public class TaxBracketNotFoundException extends RuntimeException{
    public TaxBracketNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
