package com.dufuna.berlin.kutembachinambu.tax.service;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import com.dufuna.berlin.kutembachinambu.tax.repository.TaxBracketRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaxCalcImplTest {
    @Mock
    private TaxBracketRepository taxBracketRepository;

    private TaxCalcImpl taxCalImpl;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        taxCalImpl = new TaxCalcImpl(taxBracketRepository);
    }



    @Test
    void testCalculateTax() {
        var calculate = new TaxCalcImpl(taxBracketRepository);
        assertEquals(31896.49f, taxCalImpl.calculateTax(120000f));
    }

    @Test
    void testCalculateTax1() {
        var calculate = new TaxCalcImpl(taxBracketRepository);
        assertEquals(0f, taxCalImpl.calculateTax(100f));
    }

    @Test
    void testCalculateTax2() {
        var calculate = new TaxCalcImpl(taxBracketRepository);
        assertEquals(7796.81f, taxCalImpl.calculateTax(50000f));
    }

    @Test
    void testCalculateTax3() {
        var calculate = new TaxCalcImpl(taxBracketRepository);
        assertEquals(0.19f, taxCalImpl.calculateTax(18201f));
    }


}