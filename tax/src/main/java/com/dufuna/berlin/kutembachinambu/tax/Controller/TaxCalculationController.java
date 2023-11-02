package com.dufuna.berlin.kutembachinambu.tax.Controller;

import com.dufuna.berlin.kutembachinambu.tax.service.TaxCalcImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tax")
public class TaxCalculationController {
    @Autowired
    private TaxCalcImpl taxCalc;

    @GetMapping("/calculate")
    public Float calculateTax(@RequestParam Float amount) {
        return taxCalc.calculateTax(amount);
    }
}
